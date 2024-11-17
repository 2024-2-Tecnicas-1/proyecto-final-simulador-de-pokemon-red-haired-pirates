package simulador.pokemon;
public class Shellder extends Pokemon { 
     // Declaración de la clase: O(1) 

  public Shellder() {
    super("Shellder", 30, 65, TipoPokemon.AGUA, Estado.NORMAL);
      // - Asignación de "Shellder" (String): O(1)
        // - Asignación de 40 (int) para cada uno de los dos atributos: O(1)
        // - Acceso a "TipoPokemon.AGUA" (enum): O(1)
        // - Acceso a "Estado.NORMAL" (enum): O(1)
  }
}
