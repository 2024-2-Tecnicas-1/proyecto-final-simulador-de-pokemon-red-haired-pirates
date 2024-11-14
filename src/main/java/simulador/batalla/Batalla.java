package simulador.batalla;
import simulador.pokemon.Pokemon;
//Se importa para poder usar objetos de la clase Pokemon.

public class Batalla {

    /**
    * Atributos.
    * Complejidad temporal: O(1) Complejidad Constante.
    */

    private int turnoActual;
    private Pokemon atacante;
    private Pokemon defensor;
    private boolean seguir; 

     /*
    * turnoActual: Número de turno que lleva la batalla.
    * atacante: Pokémon que realiza el daño.
    * defensor: Pokémon que recibe el daño.
    * seguir: Booleano para poder detener el turno o continuarlo.
    */



    /**
    * Método para iniciar la batalla y asignación de los atributos.
    * Complejidad temporal: O(1) Complejidad Constante.
    */ 
    
    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
        this.turnoActual = 1; 
        this.atacante = pokemon1;
        this.defensor = pokemon2;
        this.seguir = true; 

        System.out.println("¡Inicia la batalla entre " + atacante.getNombre() + " y " + defensor.getNombre() + "!");



    /**
    * Aumento del turno.
    * Complejidad temporal: O(n) Depende de la cantidad de turnos necesarios.
    */ 

        while (seguir == true) { 
            avanzarTurno();
            turnoActual++;
        } 


    /**
    * Determinación del ganador.
    * Complejidad temporal: O(1) Complejidad Constante.
    */ 

        if (atacante.getSalud() > 0) {
            System.out.println(defensor.getNombre() + " ha sido derrotado. " + atacante.getNombre() + " gana la batalla.");
        } else {
            System.out.println(atacante.getNombre() + " ha sido derrotado. " + defensor.getNombre() + " gana la batalla.");
        }
    }




    /**
    * Método que realiza un turno de batalla.
    * Complejidad temporal: O(1) Complejidad Constante.
    */

    private void avanzarTurno() {
        atacante.atacar(defensor);
        System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + ". Salud de " + defensor.getNombre() + ": " + defensor.getSalud());



    /**
    * Verifica el estado del defensor.
    * Complejidad temporal: O(1) Complejidad Constante.
    */

        if (defensor.getSalud() <= 0) {
            seguir = false;       
        }



    /**
    * Cambia los roles.
    * Complejidad temporal: O(1) Complejidad Constante.
    */

        Pokemon temp = atacante; // Se guarda el valor de "atacante" en una variable temporal llamada temp.
        atacante = defensor;    // Atacante recibe el valor de defensor.
        defensor = temp;       //Defensor recibe el valor guardado en temp, es decir, el valor original de atacante)
    }
}
