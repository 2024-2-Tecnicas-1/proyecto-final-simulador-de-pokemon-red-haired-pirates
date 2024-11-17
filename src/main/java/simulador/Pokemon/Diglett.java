package simulador.pokemon;
public class Diglett extends Pokemon { 
     // Declaración de la clase: O(1) 

      public Diglett() {
    super("Diglett", 10, 55, TipoPokemon.TIERRA, Estado.NORMAL);
      // - Asignación de "Diglett" (String): O(1)
        // - Asignación de 40 (int) para cada uno de los dos atributos: O(1)
        // - Acceso a "TipoPokemon.TIERRA" (enum): O(1)
        // - Acceso a "Estado.NORMAL" (enum): O(1)
  }
}
