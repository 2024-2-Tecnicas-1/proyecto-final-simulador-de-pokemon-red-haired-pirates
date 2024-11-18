package simulador.clinica;

import java.util.LinkedList;
import java.util.List;
import simulador.pokemon.Pokemon;

public class Clinica {
    private List<Pokemon> pacientes;
    
    public Clinica(){
        pacientes = new LinkedList<>();
    }
    
    public void ingresarPaciente(Pokemon pokemon){
        pacientes.add(pokemon);
        
    }
    
    public void curar(){
        for (Pokemon paciente : pacientes) {
            paciente.curar();
        }
        pacientes = new LinkedList<>();
    }
    public void gestionarPacientes(){
        System.out.println("Tus pokemones: "+pacientes+ "esperan ser curados.");
    }
}
