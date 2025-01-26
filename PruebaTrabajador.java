public class PruebaTrabajador {
    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador();
        Trabajador trabajador2 = new Trabajador();

        Trabajador trabajador3 = new Trabajador(123);

        trabajador3.cobrarSueldo();

        trabajador1.sueldo = 7000;
        trabajador1.turno = "Matutino";
        trabajador1.nombre = "Jorge";
        trabajador1.trabajar();
        trabajador1.cobrarSueldo();
        Trabajador.nombreEmpresa = "TV Azteca";
        trabajador1.decirNombreEmpresa();

        System.out.println();

        trabajador2.sueldo = 10000;
        trabajador2.turno = "Vespertino";
        trabajador2.nombre = "Michael";
        trabajador2.trabajar();
        trabajador2.cobrarSueldo();
        trabajador2.decirNombreEmpresa();
    }
}
