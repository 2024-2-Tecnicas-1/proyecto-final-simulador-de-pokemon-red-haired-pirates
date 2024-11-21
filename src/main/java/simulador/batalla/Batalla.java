package simulador.batalla;
import simulador.pokemon.Pokemon;
//Se importa para poder usar objetos de la clase Pokemon.

public class Batalla {

    /*
    * Atributos en órden alfabético.
    * Complejidad temporal: O(1) Complejidad Constante.
    */

    private boolean seguir; 
    private int turnoActual;
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    
     /*  
    * seguir: Booleano para poder detener el turno o continuarlo.
    * turnoActual: Número de turno que lleva la batalla.
    * pokemon1: Pokémon que realiza el daño.
    * pokemon2: Pokémon que recibe el daño.
    */



    /*
    * Método para iniciar la batalla y asignación de los atributos.
    * Complejidad temporal: O(1) Complejidad Constante.
    */ 
    
    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
        this.turnoActual = 1; 
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.seguir = true; 

        System.out.println("¡Inicia la batalla entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre() + "!");



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

        if (pokemon1.getSalud() > 0) {
            System.out.println(pokemon1.getNombre() + " ha sido derrotado. " + pokemon2.getNombre() + " gana la batalla.");
        } else {
            System.out.println(pokemon2.getNombre() + " ha sido derrotado. " + pokemon1.getNombre() + " gana la batalla.");
        }
    }




    /**
    * Método que realiza un turno de batalla.
    * Complejidad temporal: O(1) Complejidad Constante.
    */

    private void avanzarTurno() {
        pokemon1.atacar(pokemon2);
        System.out.println("Turno: "+turnoActual);
        System.out.println(pokemon1.getNombre() + " ataca a " + pokemon2.getNombre() + ". Salud de " + pokemon2.getNombre() + ": " + pokemon2.getSalud());
    



    /**
    * Verifica el estado del defensor.
    * Complejidad temporal: O(1) Complejidad Constante.
    */

        if (pokemon2.getSalud() <= 0) {
            seguir = false;       
        }
    /**
    * Cambia los roles.
    * Complejidad temporal: O(1) Complejidad Constante.
    */
        Pokemon temp = pokemon1; // Se guarda el valor de "atacante" en una variable temporal llamada temp.
        pokemon1 = pokemon2;    // Atacante recibe el valor de defensor.
        pokemon2 = temp;       //Defensor recibe el valor guardado en temp, es decir, el valor original de atacante)
        
    }
}
