package simulador.pokemon;
public class Caterpie extends Pokemon { 
     // Declaración de la clase: O(1) 

    public Caterpie() {
    super("Caterpie", 45, 30, TipoPokemon.BICHO, Estado.NORMAL);
      // - Asignación de "Caterpie" (String): O(1)
        // - Asignación de 40 (int) para cada uno de los dos atributos: O(1)
        // - Acceso a "TipoPokemon.BICHO" (enum): O(1)
        // - Acceso a "Estado.NORMAL" (enum): O(1)
  }
}
