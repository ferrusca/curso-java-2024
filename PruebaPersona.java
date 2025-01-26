public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Michael", 22);
        Persona persona2 = new Persona("Jorge");
        Persona persona3 = new Persona("Carlos", 29);

        // Asignacion solo se puede en attributos PUBLICOS
        persona1.edad = 25;
        persona1.nombre = "Michael 2.0";

        persona1.saludar();
        persona1.despedir();
        persona1.decirNombre();
        persona1.decirEdad(); // Me llamo X y tengo X años
        persona1.decirEdad();
        persona1.decirEdad();

        persona2.decirNombre();
        persona2.despedir();

        // Mi edad es 29.
        persona3.decirEdad();
        persona3.decirNombre();
    }
}
