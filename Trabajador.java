public class Trabajador {
    // ATRIBUTOS: Caracteristicas de una clase. Para usarlos usamos la palabra this
    public int sueldo = 0;
    public String turno = "";
    public String nombre = "";

    // CARACTERISTICAS de un constructor
    // * Es publico
    // * Se llama igual que la clase y lleva mayuscula
    // * No regresa ningun valor
    // * Puede haber varios (sobrecarga de constructores)
    public Trabajador() {
        System.out.println("Ejecutando el constructor VACIO...");
    }

    public Trabajador(int sueldo) {
        System.out.println("Esta llegando la cantidad de " + sueldo);
        this.sueldo = sueldo;
    }

    // STATIC: se utiliza cuando todos los ibjetos de una clase reutilizan una
    // propiedad
    public static String nombreEmpresa = "Telvista";

    // METODOS: acciones de una clase (lo que hace) -> metodos Siempre llevan
    // parentesis
    public void trabajar() {
        System.out.println("Soy " + this.nombre + " y estoy trabajando en el turno " + this.turno + "!!");
    }

    public void cobrarSueldo() {
        System.out.println("Estoy cobrando mi sueldo de $" + this.sueldo);
    }

    public void decirNombreEmpresa() {
        System.out.println("Trabajo en la empresa " + Trabajador.nombreEmpresa);
    }
}