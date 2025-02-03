public class PruebaCuenta {
    public static void main(String[] args) {
        // Creando una cuenta
        Cuenta c1 = new Cuenta("Jorge", 1500);
        System.out.println("Cuentas creadas: " + Cuenta.cuentasCreadas);

        Cuenta c2 = new Cuenta("Michael", 3000);
        System.out.println("Cuentas creadas: " + Cuenta.cuentasCreadas);

        Cuenta c3 = new Cuenta("Manuel", 2100);
        System.out.println("Cuentas creadas: " + Cuenta.cuentasCreadas);

        Cuenta c4 = new Cuenta("Alejandro", 250);
        System.out.println("Cuentas creadas: " + Cuenta.cuentasCreadas);

        System.out.println("====EJERCICIO====");

        // imprimir titular de la cuenta
        c2.imprimirTitular();

        // Consultar saldo
        c2.consultarSaldo();

        // Abonar saldo
        c2.abonarSaldo(1000);
        c2.abonarSaldo(1000);
        c2.abonarSaldo(500);

        // Debe imprimir 5500
        c2.consultarSaldo();

        c2.retirarSaldo(500);

        // Debe ser 5000
        c2.consultarSaldo();

        // Debe decir: cantidad invalida para retirar
        c2.retirarSaldo(-100);

        // No tienes suficientes fondos para retirar
        c2.retirarSaldo(6000);

        // Debe ser 5000
        c2.consultarSaldo();
    }
}
