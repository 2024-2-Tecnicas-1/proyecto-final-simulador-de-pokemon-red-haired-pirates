package simulador.pokemon;
public class Jolteon extends Pokemon { 
     // Declaración de la clase: O(1) 

    public Jolteon() {
    super("Jolteon", 65, 65, TipoPokemon.ELECTRICO, Estado.NORMAL);
      // - Asignación de "Jolteon" (String): O(1)
        // - Asignación de 40 (int) para cada uno de los dos atributos: O(1)
        // - Acceso a "TipoPokemon.ELECTRICO" (enum): O(1)
        // - Acceso a "Estado.NORMAL" (enum): O(1)
  }
}

