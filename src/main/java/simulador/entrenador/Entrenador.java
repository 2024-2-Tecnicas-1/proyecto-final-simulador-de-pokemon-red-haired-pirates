package simulador.entrenador;

import java.util.ArrayList;
import java.util.List;
import simulador.pokemon.Pokemon;

public class Entrenador {



    private String nombreEntrenador;
    // Guarda del nombre entrenador
    private static Entrenador entrenador;
    private List<Pokemon> pokemones;
    private static List<Entrenador> listaEntrenador = new ArrayList<>();

    // Lista De pokemones
    //isEmpty es que esta vacia la lista
    // Constructor de la clase.
    public Entrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
        this.pokemones = new ArrayList<>();
        // Lista vacía de pokemones usando ArrayList.
    }

    public static boolean Vacio() {
        return listaEntrenador.isEmpty();
    }
 // Agregar un nuevo entrenador
    public static void agregarEntrenador(Entrenador entrenador) {
        listaEntrenador.add(entrenador);
    }


    // Obtener el tamaño de la lista de entrenadores
    public static int size() {
        return listaEntrenador.size();
    }

    // Obtener un entrenador por su índice
    public static Entrenador get(int index) {
        return listaEntrenador.get(index);
    }

    // Mostrar la lista de entrenadores
    public static void mostrarEntrenadores() {
        if (Vacio()) {
            System.out.println("No hay entrenadores registrados.");
        } else {
            System.out.println("Lista de entrenadores:");
            for (int i = 0; i < size(); i++) {
                System.out.println((i + 1) + ". " + get(i).getNombreEntrenador());
            }
        }
    }


    // Método agregarPokemon que agrega un pokémon.
    public void agregarPokemon(Pokemon pokemon) {
        // En los torneos de Play! Pokémon, el equipo de un jugador puede estar formado por un máximo de 6 Pokémon.
        if (pokemones.size() < 6) {
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

    //  get de los atributos.
    public String getNombreEntrenador() {
        return nombreEntrenador;
    }


    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }

    //  set de la lista de pokemones.
    public void setPokemones(List<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }
}
