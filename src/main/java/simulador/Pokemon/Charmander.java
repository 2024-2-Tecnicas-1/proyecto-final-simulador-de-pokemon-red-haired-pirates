package simulador.pokemon;
public class Charmander extends Pokemon { 
     // Declaración de la clase: O(1) 

    public Charmander() {
    super("Charmander", 39, 52, TipoPokemon.FUEGO, Estado.NORMAL);
      // - Asignación de "Charmander" (String): O(1)
        // - Asignación de 40 (int) para cada uno de los dos atributos: O(1)
        // - Acceso a "TipoPokemon.FUEGO" (enum): O(1)
        // - Acceso a "Estado.NORMAL" (enum): O(1)
  }
}
