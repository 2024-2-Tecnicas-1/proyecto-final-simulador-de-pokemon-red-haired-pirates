package simulador.pokemon;
public class Articuno extends Pokemon { 
     // Declaración de la clase: O(1) 

     public Articuno() {
    super("Articuno", 90, 85, TipoPokemon.VOLADOR, Estado.NORMAL);
      // - Asignación de "Articuno" (String): O(1)
        // - Asignación de 40 (int) para cada uno de los dos atributos: O(1)
        // - Acceso a "TipoPokemon.VOLADOR" (enum): O(1)
        // - Acceso a "Estado.NORMAL" (enum): O(1)
  }
}
