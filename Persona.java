public class Persona {
    // SECCION DE ATRIBUTOS
    public String nombre;
    public int edad;
    public String direccion;
    public String curp;

    /**
     * SECCION DEL CONSTRUCTOR
     * CARACTERISTICAS DE UN CONSTRUCTOR
     * - Siempre es publico
     * - No tiene valor de retorno
     * - Se llama igual que la clase
     * - Empieza con mayuscula
     * El Constructor se manda a llamar automaticamente cada vez que se CREA un
     * objeto
     */
    public Persona(String nom) {
        nombre = nom;
    }

    public Persona(int ed) {
        edad = ed;
    }

    public Persona(String nom, int ed) {
        nombre = nom;
        edad = ed;
    }

    /**
     * SECCION DE METODOS
     */
    public void decirNombre() {
        System.out.println("Mi nombre es: " + nombre);
    }

    public void despedir() {
        System.out.println("Adios");
    }

    public void decirEdad() {
        System.out.println("Mi nombre es " + nombre + " y mi edad es: " + edad);
    }

    public void saludar() {
        System.out.println("Hola");
    }
}