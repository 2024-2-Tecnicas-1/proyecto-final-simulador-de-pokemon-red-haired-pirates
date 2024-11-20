package simulador.clinica;

import java.util.LinkedList;
import java.util.List;

import simulador.entrenador.Entrenador;
import simulador.pokemon.Estado;
import simulador.pokemon.Pokemon;

public class Clinica {
    private List<Pokemon> pacientes;

    public Clinica() {
        pacientes = new LinkedList<>();

    }

    public void ingresarPaciente(String nombrePokemon) {
        // Buscar entre los entrenadores si el Pokémon existe
        for (int i = 0; i < Entrenador.size(); i++) {
            Entrenador entrenador = Entrenador.get(i); // Obtiene cada entrenador
            for (Pokemon pokemon : entrenador.getPokemones()) { // Ve sus Pokémon
                if (pokemon.getNombre().equals(nombrePokemon)) { // Verifica coincidencia 
                    // Verifica si el Pokémon ya está ingresado
                    if (pacientes.contains(pokemon)) {
                        System.out.println(pokemon.getNombre() + " ya está ingresado en la clínica.");
                        return;
                    }

                    // Ingresa el Pokémon
                    pacientes.add(pokemon);
                    System.out.println("Pokémon " + pokemon.getNombre() + " ingresado a la clínica.");
                    return;
                }
            }
        }
    }
    public void curar() {
        for (Pokemon paciente : pacientes) {
            paciente.curar();
            paciente.setEstado(Estado.NORMAL);
        }
        pacientes = new LinkedList<>();
        System.out.println("Todos los Pokémones han sido curados.");
    }

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

