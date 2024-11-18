package simulador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import simulador.batalla.Batalla;
import simulador.clinica.Clinica;
import simulador.entrenador.Entrenador;
import simulador.pokemon.*;

public class Principal {

    private static Scanner sc = new Scanner(System.in); // O(1): Crear un objeto Scanner es una operación constante.
    private static String idioma = "es"; // O(1): Asignar un valor a una variable es constante.

    private static Clinica clinicaPokemon = new Clinica();
    
    public static void main(String[] args) {
        seleccionarIdioma(); // Complejidad: O(n), dependiendo del input del usuario.
        mostrarMenuPrincipal(); // Complejidad: O(n), el menú puede ejecutarse indefinidamente.
    }

    // Método para mostrar el menú principal
    private static void mostrarMenuPrincipal() {
        while (true) { // Complejidad: O(n), donde n es el número de iteraciones hasta que se elige salir.
            System.out.println(tr("Bienvenido al simulador de batallas Pokémon")); // O(1)
            System.out.println("1. " + tr("Gestionar Entrenadores")); // O(1)
            System.out.println("2. " + tr("Gestionar Pokémones")); // O(1)
            System.out.println("3. " + tr("Iniciar Batalla")); // O(1)
            System.out.println("4. " + tr("Seleccionar Idioma")); // O(1)
            System.out.println("6. " + tr("Gestionar Clínica")); // O(1)
            System.out.println("5. " + tr("Salir")); // O(1)
            System.out.print(tr("Elige una opción: ")); // O(1)
            int opcion = sc.nextInt(); // O(1): Leer un número del usuario es constante.
            switch (opcion) { // O(1): Comparar un valor con varias opciones es constante.
                case 1:
                    gestionarEntrenadores(); // Complejidad: O(m), donde m depende de las operaciones realizadas.

                    break;
                case 2:
                    gestionarPokemones(); // Complejidad: O(p), dependiendo de las opciones de Pokémon.
                    break;
                case 3:
                    iniciarBatalla(); // Complejidad: O(b), donde b depende de la lógica implementada.
                    break;
                case 4:
                    seleccionarIdioma(); // Complejidad: O(n), dependiendo del input del usuario.
                    break;
                case 5:
                    System.out.println(tr("Cerrando el juego...")); // O(1)
                    return; // Salir del método.
                case 6:
                    gestionarClinica();
                    break;
                default:
                    System.out.println(tr("Opción no válida. Intenta nuevamente.")); // O(1)
            }
        }
    }
    
    private static void gestionarClinica(){
        while (true) { // Complejidad: O(m), donde m es el número de iteraciones del menú.
            System.out.println("1. " + tr("Ingresar Paciente")); // O(1)
            System.out.println("2. " + tr("Gestionar Pacientes")); // O(1)
            System.out.println("3. " + tr("Curar")); // O(1)
            System.out.print(tr("Elige una opción: ")); // O(1)
            int opcion = sc.nextInt(); // O(1)
            switch (opcion) { // O(1)
                case 1:
                    clinicaPokemon.ingresarPaciente(pokemon);
                    
                case 2:
                    clinicaPokemon.gestionarPacientes();
                case 3:
                    clinicaPokemon.curar();
                default:
                    System.out.println(tr("Opción no válida. Intenta nuevamente.")); // O(1)
            }
        }
    }

    // Método para gestionar entrenadores
    private static void gestionarEntrenadores() {
        while (true) { // Complejidad: O(m), donde m es el número de iteraciones del menú.
            System.out.println("1. " + tr("Registrar nuevo entrenador")); // O(1)
            System.out.println("2. " + tr("Ver lista de entrenadores")); // O(1)
            System.out.println("3. " + tr("Seleccionar un entrenador")); // O(1)
            System.out.println("4. " + tr("Volver al menú principal")); // O(1)
            System.out.print(tr("Elige una opción: ")); // O(1)
            int opcion = sc.nextInt(); // O(1)
            switch (opcion) { // O(1)
                case 1:
                    registrarEntrenador();
                case 2:
                    verEntrenadores();
                case 3:
                    //seleccionarEntrenador();
                    break;
                case 4:
                    return; // Salir del menú.
                default:
                    System.out.println(tr("Opción no válida. Intenta nuevamente.")); // O(1)
            }
        }
    }

    // Método para gestionar Pokémon
    private static void gestionarPokemones() {
        System.out.println("1. " + tr("Ver todos los Pokémon registrados")); // O(1)
        System.out.println("2. " + tr("Registrar nuevo Pokémon")); // O(1)
        System.out.println("3. " + tr("Volver al menú principal")); // O(1)
        System.out.print(tr("Elige una opción: ")); // O(1)
        int opcion = sc.nextInt(); // O(1)
        switch (opcion) { // O(1)
            case 1:
            case 2:
                // Implementar lógica específica.
                break;
            case 3:
                return; // Salir del método.
            default:
                System.out.println(tr("Opción no válida.")); // O(1)
        }
    }

    // Método para iniciar batalla
    private static void iniciarBatalla() {
        while (true) { // Complejidad: O(b), donde b es el número de iteraciones del menú.
            System.out.println("1. " + tr("Elegir entrenador uno")); // O(1)
            System.out.println("2. " + tr("Elegir entrenador dos")); // O(1)
            System.out.println("3. " + tr("Seleccionar Pokémon de entrenador uno")); // O(1)
            System.out.println("4. " + tr("Seleccionar Pokémon de entrenador dos")); // O(1)
            System.out.println("5. " + tr("Comenzar Batalla")); // O(1)
            System.out.println("6. " + tr("Volver al menú principal")); // O(1)
            System.out.print(tr("Elige una opción: ")); // O(1)
            int opcion = sc.nextInt(); // O(1)
            switch (opcion) { // O(1)
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    // Implementar lógica específica.
                    break;
                case 6:
                    return; // Salir del método.
                default:
                    System.out.println(tr("Opción no válida. Intenta nuevamente.")); // O(1)
            }
        }
    }

// Registrar un nuevo entrenador desde la entrada del usuario
    public static void registrarEntrenador() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- CREAR NUEVO ENTRENADOR ---");
        System.out.print("Introduce el nombre del nuevo entrenador: ");
        String nombre = sc.nextLine();

        Entrenador nuevoEntrenador = new Entrenador(nombre);
        Entrenador.agregarEntrenador(nuevoEntrenador);

        System.out.println("Entrenador " + nombre + " ha sido creado y añadido a la lista.");
    }


    private static void verEntrenadores() {
        if (Entrenador.Vacio()) {
            System.out.println("No hay entrenadores registrados.");
            return;
        }

        System.out.println("Lista de entrenadores:");
        for (int i = 0; i < Entrenador.size(); i++) {
            System.out.println((i + 1) + ". " + Entrenador.get(i).getNombreEntrenador());
        }

        System.out.print("Selecciona un entrenador por su número: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        if (opcion < 1 || opcion > Entrenador.size()) {
            System.out.println("Opción inválida.");
        } else {
            Entrenador entrenadorSeleccionado = Entrenador.get(opcion - 1);
            System.out.println("Entrenador seleccionado: " + entrenadorSeleccionado.getNombreEntrenador());

            // Llamar a otro método para que el entrenador elija un Pokémon
            seleccionarPokemon(entrenadorSeleccionado);
        }
    }

    private static void seleccionarPokemon(Entrenador entrenador) {
        if (entrenador.getPokemones().isEmpty()) {
            System.out.println(entrenador.getNombreEntrenador() + " no tiene Pokémones en su equipo.");
            return;
        }

        System.out.println("Lista de Pokémon de " + entrenador.getNombreEntrenador() + ":");
        List<Pokemon> pokemones = entrenador.getPokemones();

        for (int i = 0; i < pokemones.size(); i++) {
            Pokemon pokemon = pokemones.get(i);
            System.out.println((i + 1) + ". " + pokemon.getNombre() + " (Nivel: " + pokemon.getNivel() + ")");
        }

        System.out.print("Selecciona un Pokémon por su número: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        if (opcion < 1 || opcion > pokemones.size()) {
            System.out.println("Opción inválida.");
        } else {
            Pokemon pokemonSeleccionado = pokemones.get(opcion - 1);
            System.out.println("Has seleccionado a " + pokemonSeleccionado.getNombre() + " (Nivel: " + pokemonSeleccionado.getNivel() + ").");

            // Aquí puedes realizar más operaciones con el Pokémon seleccionado
        }
    }

    // Método para seleccionar idioma
    private static void seleccionarIdioma() {
        System.out.println("1. Español"); // O(1)
        System.out.println("2. English"); // O(1)
        System.out.print("Selecciona tu idioma / Select your language: "); // O(1)
        int opcion = sc.nextInt(); // O(1)
        if (opcion == 1) {
            idioma = "español"; // O(1)
        } else if (opcion == 2) {
            idioma = "english"; // O(1)
        } else {
            System.out.println(tr("Opción no válida. Manteniendo el idioma actual.")); // O(1)
        }
    }

    // Método para traducir textos
    private static String tr(String texto) {
        switch (idioma) { // O(1), dado que solo compara con un número limitado de opciones.
            case "english":
                return traducirIngles(texto); // O(1), asume que la traducción directa en el switch es constante.
            default:
                return texto; // O(1)
        }
    }

    // Traducciones al inglés
    private static String traducirIngles(String texto) {
        switch (texto) { // O(1), dado que compara con un número limitado de textos.
            // Casos específicos (cada uno: O(1))
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
            case "Opción no válida. Intenta nuevamente.":
                return "Invalid option. Try again.";
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
            default:
                return texto;
        }
    }


}
