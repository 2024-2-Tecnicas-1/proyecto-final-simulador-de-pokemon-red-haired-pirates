package simulador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import simulador.batalla.Batalla;
import simulador.clinica.Clinica;
import simulador.entrenador.Entrenador;
import simulador.pokemon.*;

public class Principal {

    private static Scanner sc = new Scanner(System.in);
    private static String idioma = "es";
    private static List<Entrenador> entrenadores = new ArrayList<>();

    public static void main(String[] args) {
        seleccionarIdioma();
        mostrarMenuPrincipal();
    }

    // Método para mostrar el menú principal
    private static void mostrarMenuPrincipal() {
        while (true) {
            System.out.println(tr("Bienvenido al simulador de batallas Pokémon"));
            System.out.println("1. " + tr("Gestionar Entrenadores"));
            System.out.println("2. " + tr("Gestionar Pokémones"));
            System.out.println("3. " + tr("Iniciar Batalla"));
            System.out.println("4. " + tr("Seleccionar Idioma"));
            System.out.println("5. " + tr("Salir"));
            System.out.print(tr("Elige una opción: "));
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    gestionarEntrenadores();
                    break;
                case 2:
                    gestionarPokemones();
                    break;
                case 3:
                    iniciarBatalla();
                    break;
                case 4:
                    seleccionarIdioma();
                    break;
                case 5:
                    System.out.println(tr("Cerrando el juego..."));
                    return;
                default:
                    System.out.println(tr("Opción no válida. Intenta nuevamente."));
            }
        }
    }

    // Método para gestionar entrenadores
    private static void gestionarEntrenadores() {
        while (true) {
            System.out.println("1. " + tr("Registrar nuevo entrenador"));
            System.out.println("2. " + tr("Ver lista de entrenadores"));
            System.out.println("3. " + tr("Seleccionar un entrenador"));
            System.out.println("4. " + tr("Volver al menú principal"));
            System.out.print(tr("Elige una opción: "));
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    registrarEntrenador();
                    break;
                case 2:
                    verListaEntrenadores();
                    break;
                case 3:
                    // Implementar lógica para seleccionar un entrenador
                    break;
                case 4:
                    return; // Salir del menú
                default:
                    System.out.println(tr("Opción no válida. Intenta nuevamente."));
            }
        }
    }

    // Método para registrar un nuevo entrenador
    private static void registrarEntrenador() {
        System.out.print(tr("Introduce el nombre del entrenador: "));
        String nombre = sc.next();
        Entrenador nuevoEntrenador = new Entrenador(nombre);
        entrenadores.add(nuevoEntrenador);
        System.out.println(tr("Entrenador registrado con éxito."));
    }

    // Método para ver la lista de entrenadores
    private static void verListaEntrenadores() {
        if (entrenadores.isEmpty()) {
            System.out.println(tr("No hay entrenadores registrados."));
        } else {
            System.out.println(tr("Lista de entrenadores:"));
            for (Entrenador entrenador : entrenadores) {
                System.out.println("- " + entrenador.getNombreEntrenador());
            }
        }
    }

    // Método para gestionar Pokémon
    private static void gestionarPokemones() {
        while (true) {
            System.out.println("1. " + tr("Ver todos los Pokémon registrados"));
            System.out.println("2. " + tr("Registrar nuevo Pokémon"));
            System.out.println("3. " + tr("Volver al menú principal"));
            System.out.print(tr("Elige una opción: "));
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    verPokemonesRegistrados();
                    break;
                case 2:
                    registrarPokemon();
                    break;
                case 3:
                    return; // Salir del método
                default:
                    System.out.println(tr("Opción no válida."));
            }
        }
    }

    // Método para ver Pokémon registrados
    private static void verPokemonesRegistrados() {
        System.out.println(tr("Lista de Pokémon registrados:"));
        for (Entrenador entrenador : entrenadores) {
            entrenador.mostrarPokemones();
        }
    }

    // Método para registrar un nuevo Pokémon
    private static void registrarPokemon() {
        System.out.println("Selecciona el tipo de Pokémon a registrar:");
        System.out.println("1. Pikachu");
        System.out.println("2. Charmander");
        System.out.println("3. Drowzee");
        System.out.println("4. Articuno");
        System.out.println("5. Bulbasaur");
        System.out.println("6. Squirtle");
        System.out.println("7. Jigglypuff");
        System.out.println("8. Meowth");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        Pokemon nuevoPokemon = null;
        switch (opcion) {
            case 1:
                nuevoPokemon = new Caterpie();
                break;
            case 2:
                nuevoPokemon = new Charmander();
                break;
            case 3:
                nuevoPokemon = new Drowzee();
                break;
            case 4:
                nuevoPokemon = new Articuno();
                break;
            case 5:
                nuevoPokemon = new Diglett();
                break;
            case 6:
                nuevoPokemon = new Hitmonlee();
                break;
            case 7:
                nuevoPokemon = new Jolteon();
                break;
            case 8:
                nuevoPokemon = new Shellder();
                break;
            default:
                System.out.println(tr("Opción no válida."));
                return;
        }

        System.out.print(tr("Introduce el nombre del Pokémon: "));
        String nombre = sc.next();
        nuevoPokemon.setNombre(nombre);

        // Asumiendo que cada entrenador tiene una lista de Pokémon
        if (!entrenadores.isEmpty()) {
            System.out.print(tr("Selecciona el entrenador para el Pokémon: "));
            verListaEntrenadores();
            int indexEntrenador = sc.nextInt() - 1;
            if (indexEntrenador >= 0 && indexEntrenador < entrenadores.size()) {
                entrenadores.get(indexEntrenador).agregarPokemon(nuevoPokemon);
                System.out.println(tr("Pokémon registrado con éxito."));
            } else {
                System.out.println(tr("Entrenador no válido."));
            }
        } else {
            System.out.println(tr("No hay entrenadores registrados. Registra un entrenador primero."));
        }
    }

    // Método para iniciar batalla
    private static void iniciarBatalla() {
        if (entrenadores.size() < 2) {
            System.out.println(tr("Se necesitan al menos dos entrenadores para iniciar una batalla."));
            return;
        }

        System.out.println(tr("Selecciona el primer entrenador:"));
        verListaEntrenadores();
        int indexEntrenador1 = sc.nextInt() - 1;

        System.out.println(tr("Selecciona el segundo entrenador:"));
        verListaEntrenadores();
        int indexEntrenador2 = sc.nextInt() - 1;

        if (indexEntrenador1 >= 0 && indexEntrenador1 < entrenadores.size()
                && indexEntrenador2 >= 0 && indexEntrenador2 < entrenadores.size()
                && indexEntrenador1 != indexEntrenador2) {
            Entrenador entrenador1 = entrenadores.get(indexEntrenador1);
            Entrenador entrenador2 = entrenadores.get(indexEntrenador2);
            Batalla batalla = new Batalla(entrenador1, entrenador2);
            batalla.iniciar();
        } else {
            System.out.println(tr("Selección de entrenadores no válida."));
        }
    }

    // Método para seleccionar idioma
    private static void seleccionarIdioma() {
        System.out.println("1. Español");
        System.out.println("2. English");
        System.out.print("Selecciona tu idioma / Select your language: ");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            idioma = "español";
        } else if (opcion == 2) {
            idioma = "english";
        } else {
            System.out.println(tr("Opción no válida. Manteniendo el idioma actual."));
        }
    }
    // Método para traducir textos

// Método para traducir textos
    private static String tr(String texto) {
        switch (idioma) {
            case "english":
                return traducirIngles(texto);
            default:
                return texto;
        }
    }

// Traducciones al inglés
    private static String traducirIngles(String texto) {
        switch (texto) {
            case "Bienvenido al simulador de batallas Pokémon":
                return "Welcome to the Pokémon Battle Simulator";
            case "Gestionar Entrenadores":
                return "Manage Trainers";
            case "Gestionar Pokémones":
                return "Manage Pokémon";
            case "Iniciar Batalla":
                return "Start Battle";
            case "Seleccionar Idioma":
                return "Select Language";
            case "Salir":
                return "Exit";
            case "Elige una opción: ":
                return "Choose an option: ";
            case "Opción no válida. Intenta nuevamente. ":
                return "Invalid option. Try again. ";
            case "Cerrando el juego...":
                return "Closing the game...";
            case "Registrar nuevo entrenador":
                return "Register new trainer";
            case "Ver lista de entrenadores":
                return "View trainer list";
            case "Seleccionar un entrenador":
                return "Select a trainer";
            case "Volver al menú principal":
                return "Return to main menu";
            case "Ver todos los Pokémon registrados":
                return "View all registered Pokémon";
            case "Registrar nuevo Pokémon":
                return "Register new Pokémon";
            case "Elegir entrenador uno":
                return "Choose trainer one";
            case "Elegir entrenador dos":
                return "Choose trainer two";
            case "Seleccionar Pokémon de entrenador uno":
                return "Select trainer one's Pokémon";
            case "Seleccionar Pokémon de entrenador dos":
                return "Select trainer two's Pokémon";
            case "Comenzar Batalla":
                return "Start Battle";
            case "No hay entrenadores registrados.":
                return "No trainers registered.";
            case "Pokémon registrado con éxito.":
                return "Pokémon registered successfully.";
            case "No hay Pokémon registrados.":
                return "No Pokémon registered.";
            case "Selecciona el entrenador para el Pokémon:":
                return "Select the trainer for the Pokémon:";
            case "Entrenador no válido.":
                return "Invalid trainer.";
            case "Se necesitan al menos dos entrenadores para iniciar una batalla.":
                return "At least two trainers are needed to start a battle.";
            case "Selección de entrenadores no válida.":
                return "Invalid trainer selection.";
            default:
                return texto;
        }
    }
}
