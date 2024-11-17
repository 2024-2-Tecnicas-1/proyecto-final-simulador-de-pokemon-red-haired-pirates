package simulador.pokemon;
public class Tentacool extends Pokemon { 
    // Declaración de la clase: O(1) 

    public Tentacool() {
        // Llamada al constructor de la clase padre: O(1)
        super("Tentacool", 40, 40, TipoPokemon.VENENO, Estado.NORMAL);
        // - Asignación de "Tentacool" (String): O(1)
        // - Asignación de 40 (int) para cada uno de los dos atributos: O(1)
        // - Acceso a "TipoPokemon.VENENO" (enum): O(1)
        // - Acceso a "Estado.NORMAL" (enum): O(1)
    }
}

