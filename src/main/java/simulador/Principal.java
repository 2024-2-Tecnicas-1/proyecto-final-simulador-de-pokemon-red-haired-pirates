package simulador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import simulador.batalla.Batalla;
import simulador.entrenador.Entrenador;
import simulador.pokemon.*;

public class Principal {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }

    // Método para mostrar el menú principal
    private static void mostrarMenuPrincipal() {
        System.out.println("Bienvenido al simulador de batallas Pokémon");
        while (true) {
            System.out.println("1. Gestionar Entrenadores");
            System.out.println("2. Gestionar Pokémones");
            System.out.println("3. Iniciar Batalla");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
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
                    System.out.println("Cerrando el juego...");
                    return;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }
    }

    // Método para gestionar entrenadores
    private static void gestionarEntrenadores() {
        System.out.println("Elige el nombre del entrenador");
        while (true) {
            System.out.println("1. Registrar nuevo entrenador");
            System.out.println("2. Ver lista de entrenadores");
            System.out.println("3. Seleccionar un entrenador");
            System.out.println("4. Volver al menu principal");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    return;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }
    }

    // Método para gestionar Pokémon
    private static void gestionarPokemones() {
        System.out.println("1. ver todos los pokemones registrados");
        System.out.println("2. Registrar nuevo pokemon");
        System.out.println("3. Volver al menu principal");
        int opcion = sc.nextInt();
        Pokemon pokemon = null;
        switch (opcion) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

    }

    // Método para iniciar batalla
    private static void iniciarBatalla() {
        while (true) {
            System.out.println("1. Elegir entrenador uno");
            System.out.println("2. Elegir entrenador dos");
            System.out.println("3. Seleccionar pokemon de entrenador uno");
            System.out.println("4. Seleccionar pokemon de entrenador dos");
            System.out.println("5. Comenzar Batalla");
            System.out.println("6. Volver al menu principal");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    return;
                case 5:

                    break;
                case 6:

                    return;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }
    }
}
