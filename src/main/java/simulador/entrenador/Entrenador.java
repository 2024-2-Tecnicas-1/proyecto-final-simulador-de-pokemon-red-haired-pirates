package simulador.entrenador;

import java.util.ArrayList;
import java.util.List;
import simulador.pokemon.Pokemon;

public class Entrenador {
private String nombre;
    private List<Pokemon> pokemones;
    private static List<Entrenador> entrenadores = new ArrayList<>();

    // Constructor
    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
    }

    // Métodos para gestionar entrenadores
    public static void agregarEntrenador(Entrenador entrenador) {
        entrenadores.add(entrenador);
    }

    public static void mostrarEntrenadores() {
        if (entrenadores.isEmpty()) {
            System.out.println("No hay entrenadores registrados.");
        } else {
            System.out.println("\n--- LISTA DE ENTRENADORES ---");
            for (int i = 0; i < entrenadores.size(); i++) {
                System.out.println((i + 1) + ". " + entrenadores.get(i).getNombreEntrenador());
            }
        }
    }

    public static boolean Vacio() {
        return entrenadores.isEmpty();
    }

    public static int size() {
        return entrenadores.size();
    }

    public static Entrenador get(int index) {
        return entrenadores.get(index);
    }

    // Métodos relacionados con el entrenador
    public String getNombreEntrenador() {
        return nombre;
    }

    // Método agregarPokemon que agrega un pokémon.
    public void agregarPokemon(Pokemon pokemon) {
        // En los torneos de Play! Pokémon, el equipo de un jugador puede estar formado por un máximo de 6 Pokémon.
        if (pokemones.size() <= 6) {
            pokemones.add(pokemon);
        }
    }

    // Método que entrena a un pokémon.
    public void entrenarPokemon(Pokemon pokemon) { // Se pasa el Pokémon a entrenar como parámetro.
        // Verifica si el Pokémon que se quiere entrenar existe en la lista.
        if (pokemones.contains(pokemon)) {
            pokemon.entrenar();
            // Ataque +5 y salud +10
        } else {
            System.out.println("El Pokémon no está en el equipo.");
        }
    }

    // Método que muestra la lista de los pokemones actuales de Entrenador junto a su nivel.
    public void mostrarPokemones() {
        if (pokemones.isEmpty()) {
            System.out.println("No tienes Pokémones en tu equipo.");
        } else {
            String nombreEntrenador = null;
            System.out.println("Pokémones de " + nombreEntrenador + ":");

            // Un bucle para todos los elementos de la lista pokemones, imprime el nombre y el nivel de cada Pokemon.
            for (Pokemon pokemon : pokemones) {
                System.out.println(pokemon.getNombre() + " - Nivel: " + pokemon.getNivel());
            }
        }
    }

    // Método que prepara al pokémon para una batalla.
    public Pokemon prepararBatalla() {
        if (pokemones.isEmpty()) {
            System.out.println("No hay Pokémones en tu equipo para la batalla.");
            return null;
        }
        //preguntar al profe como hacer para que elija aleatoriamente
        Pokemon pokemonBatalla = pokemones.get(0); // Selecciona el primer Pokémon del equipo en el ArrayList.
        System.out.println(pokemonBatalla.getNombre() + " ha sido seleccionado.");
        return pokemonBatalla;
    }



    public List<Pokemon> getPokemones() {
        return pokemones;
    }

    //  set de la lista de pokemones.
    public void setPokemones(List<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

}
