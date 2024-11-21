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
    
    public void ingresarPaciente(Pokemon pokemon){
        pacientes.add(pokemon);
        
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

