package simulador.pokemon;
public class Hitmonlee  extends Pokemon { 
     // Declaración de la clase: O(1) 

      public Hitmonlee() {
    super("Hitmonlee", 50, 120, TipoPokemon.LUCHA, Estado.NORMAL);
      // - Asignación de "Hitmonlee" (String): O(1)
        // - Asignación de 40 (int) para cada uno de los dos atributos: O(1)
        // - Acceso a "TipoPokemon.LUCHA" (enum): O(1)
        // - Acceso a "Estado.NORMAL" (enum): O(1)
  }
}
