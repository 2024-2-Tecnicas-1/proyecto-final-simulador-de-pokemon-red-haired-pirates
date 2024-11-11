package simulador.pokemon;

public enum TipoPokemon {
    // Clase especial orientada a objetos y se utiliza para def un conjunto fijo de constantes asociadas a un valor.
    //Complejidad constante O(1)
    FUEGO,AGUA,PLANTA,VENENO,ELECTRICO,PSIQUICO,ROCA,TIERRA,NORMAL,VOLADOR,HADA,LUCHA,ACERO,BICHO,HIELO,FANTASMA;
    public static double obtenerMultiplicadorDeDaño(TipoPokemon atacante, TipoPokemon defensor){ 
        
        double[][] efectividad = { //O(1)
             
         // FUEGO  AGUA  PLANTA VENENO ELECT PSIQ ROCA TIERR NORM VOLADOR HADA LUCHA ACERO BICHO HIELO FANTA 
            { 1,    0.5,   2,    1,    1,    1,   0.5,   1,    1,    1,    1,    1,   0.5,   2,    2,    1 }, // FUEGO
            { 2,     1,   0.5,   1,    1,    1,    2,    1,    1,    1,    1,    1,    1,    1,    1,    1 }, // AGUA
            { 0.5,   2,    1,   0.5,   1,    1,    2,    2,    1,    1,    1,    1,   0.5,  0.5,   1,    1 }, // PLANTA
            { 1,     1,    2,    1,    1,    1,   0.5,   1,    1,    1,    2,    1,    1,    1,    1,   0.5 }, // VENENO
            { 1,     2,   0.5,   1,    1,    1,    1,    0,    1,    2,    1,    1,    1,    1,    1,    1 }, // ELECTRICO
            { 1,     1,    1,    2,    1,    1,    1,    1,    1,    1,    1,    2,    1,    1,    1,    1 }, // PSIQUICO
            { 2,     1,    1,    1,    1,    1,    1,    1,    1,    2,    1,   0.5,   2,    2,    2,    1 }, // ROCA
            { 2,     1,    1,    2,    0,    1,    2,    1,    1,   0.5,   1,    1,    2,    1,    1,    1 }, // TIERRA
            { 1,     1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    0 }, // NORMAL
            { 1,     1,    2,    1,    2,    1,   0.5,   1,    1,    1,    1,    1,    1,    2,    1,    1 }, // VOLADOR
            { 1,     1,    1,    1,    1,    2,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1 }, // HADA
            { 1,     1,    1,    1,    1,   0.5,   2,    1,    2,    1,   0.5,   1,    1,    1,    2,   0.5 }, // LUCHA
            { 2,     1,    1,    1,    1,   0.5,   2,    1,    1,    1,    2,    2,    1,    1,    1,    1 }, // ACERO
            { 1,     1,    2,    1,    1,    1,    1,    1,    1,    2,    1,    1,   0.5,   1,    1,   0.5 }, // BICHO
            { 1,     1,    2,    1,    1,    1,    1,    2,    1,    1,    1,    1,    1,    1,    1,    1 }, // HIELO
            { 1,     1,    1,   0.5,   1,    1,    1,    1,    0,    1,    1,    1,    1,    1,    1,    2 }, // FANTASMA
        }; 
//Ordinal recorre el codigo que esta dentro de num sirve para dar la posicion o valor asignado que se necesite.
        return efectividad[atacante.ordinal()][defensor.ordinal()];  //O(1)
    } 
}
