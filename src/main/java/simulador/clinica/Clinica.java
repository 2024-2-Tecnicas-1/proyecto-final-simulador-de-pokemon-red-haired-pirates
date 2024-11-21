package simulador.clinica;

import java.util.LinkedList;
import java.util.List;
//Listas
import simulador.entrenador.Entrenador;
import simulador.pokemon.Estado;
import simulador.pokemon.Pokemon;
//Se importa para poder usar objetos de las clases Pokemon, Estado y Entrenador.


public class Clinica {
    //Atributo pacientes que declara una lista
    private List<Pokemon> pacientes;

    //Constructor clínica que inicializa la lista
    public Clinica() {
        pacientes = new LinkedList<>();

    }

    /*
    * Método para añadir Pokemones a la lista.
    * Complejidad temporal: O(n) Depende de la cantidad de pokemones y entrenadores.
    */
    public void ingresarPaciente(String nombrePokemon, List<Entrenador> entrenadores) { 
        for (Entrenador entrenador : entrenadores) { //Recorre la lista de entrenadores.
            for (Pokemon pokemon : entrenador.getPokemones()) { //Se recorre la lista de pokemones de cada entrenador.
                if (pokemon.getNombre().equals(nombrePokemon)) { //Verifica si coincide el nombre dado con el nombre de algún pokemon.
                    if (pacientes.contains(pokemon)) { //Verifica si ya está en la lista
                        System.out.println(pokemon.getNombre() + " ya está ingresado en la clínica.");
                        return;
                    }
                    pacientes.add(pokemon); //Añade el pokemon como paciente
                    System.out.println("Pokémon " + pokemon.getNombre() + " ingresado a la clínica.");
                    return;
                }
            }
        }
        System.out.println("Pokémon no encontrado en los equipos de los entrenadores.");
    }

 




    /*
    * Método para restablecer la vida de los Pokemones.
    * Complejidad temporal: O(n) Depende de la cantidad de pokemones en la clínica.
    */

    public void curar() {
        for (Pokemon paciente : pacientes) {
            paciente.curar();
            paciente.setEstado(Estado.NORMAL); //Quitar estado debilitado
        }
        pacientes = new LinkedList<>();
        System.out.println("Todos los Pokémones han sido curados.");
    }



    /*
    * Método para ver los pokemones y su estado en la clínica.
    * Complejidad temporal: O(n) Depende de la cantidad de pokemones en la clínica.
    */
  
    public void gestionarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay Pokémones en la clínica.");
        } else {
            System.out.println("Pokémones en la clínica:");
            for (Pokemon paciente : pacientes) {
                System.out.println("- " + paciente.getNombre() + " (Estado: " + paciente.getEstado() + ")");
            }
        }
    }
}

