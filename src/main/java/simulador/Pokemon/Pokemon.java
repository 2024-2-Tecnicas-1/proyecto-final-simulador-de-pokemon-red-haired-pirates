package simulador.pokemon;
public abstract class Pokemon {
    
    /**
    * Atributos en orden alfabético.
    * Complejidad temporal: O(1) Complejidad Constante.
    */
    
    private Estado estado;
    private int experiencia;
    private int nivel;
    private int puntosDeAtaque;
    private String nombre;
    private int salud;
    private int saludInicial;
    private TipoPokemon tipoPokemon;
    
    /*
    * nombre: El nombre del Pokémon.
    * salud: Puntos de vida del Pokémon.
    * puntosDeAtaque: La potencia base de los ataques del Pokémon.
    * tipo: El tipo elemental del Pokémon, basado en la enumeración TipoPokemon.
    * estado: Indica si el Pokémon está en condiciones normales, debilitado, etc.
    * nivel: Evolución en la que se encuentra el pokemon.
    * experiencia: Puntos que tiene un pokemon para aumentar de nivel.
    */
    
    
    
    
    /*
    * Constructores.
    * Complejidad temporal: O(1) Complejidad Constante.
    */
    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipoPokemon, Estado estado) {
        this.nombre = nombre;
        this.saludInicial = salud;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipoPokemon = tipoPokemon;
        this.estado = estado;
        this.nivel = 1;
        this.experiencia = 0;
    }

    
    //Métodos en orden alfabético.
    
    
    /*
    * Método para atacar al pokemon oponente.  
    * Complejidad temporal: O(1) Complejidad Constante.
    */
    public void atacar(Pokemon oponente) {
    // Multiplicador de daño según el tipo de pokemon.
    double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(this.tipoPokemon, oponente.tipoPokemon);    
    //valor entero del daño
    int daño = (int) (this.puntosDeAtaque * multiplicador);
        oponente.recibirDaño(daño);       
        ganarExperiencia(10); 
    }    
    //Realiza un ataque al oponente, teniendo en cuenta las ventajas y desventajas de cada tipo.
    
    

    /*   
    * Método que restablece la vida del pokemon.
    * Complejidad temporal: O(1) Complejidad Constante.
    */
    public void curar(){
        this.salud = this.saludInicial;
    }
      

    /*   
    * Método para entrenar a los pokemones. 
    * Complejidad temporal: O(1) Complejidad Constante.
    */

    public void entrenar() {
        this.puntosDeAtaque += 5;
        this.salud += 10;
    }

    //Mejora las estadísticas del Pokémon.




    /*   
    * Método que acumula los puntos de experiencia del pokemon.
    * Complejidad temporal: O(1) Complejidad Constante.
    */
    public void ganarExperiencia(int puntos) {
        experiencia += puntos; 
        //Verifica si llega al límite de experiencia para aumentar de nivel y por cada nivel que va subiendo se multiplica por 50 la cantidad de experiencia que necesita
        if (experiencia >= nivel * 50) { 
            subirDeNivel();  // Si se alcanza el umbral, sube el nivel del Pokémon.
        }
        }


    /*
    * Método que recibe el daño del pokemon oponente.
    * Complejidad temporal: O(1) Complejidad Constante.
    */  
    public void recibirDaño(int daño) {
        salud -= daño;
        //La salud no puede bajar de 0
        if (salud <= 0) {
            salud = 0;
            estado = Estado.DEBILITADO;
        }
    }
    //Reduce la salud del Pokémon basado en el daño recibido.
  
    
    
    /*   
    * Método que evoluciona al pokemon.
    * Complejidad temporal: O(1) Complejidad Constante.
    */
    public void subirDeNivel() {
    nivel++;
    experiencia=0;  
    salud+=20;
    puntosDeAtaque+=10;
    //El doble de lo que ganan entrenando
    System.out.println(nombre+" ha subido al nivel "+nivel);
    }    
    
    
    
    /*   
    * Métodos getter.
    * Complejidad temporal: O(1) Complejidad Constante.
    */
    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public TipoPokemon getTipoPokemon() {
        return tipoPokemon;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    /*   
    * Métodos setter usados.
    * Complejidad temporal: O(1) Complejidad Constante.
    */ 

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
