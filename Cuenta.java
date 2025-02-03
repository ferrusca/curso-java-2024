import java.util.Random;

public class Cuenta {
    private double saldo;
    private String nombre;
    private int noCuenta;

    static int cuentasCreadas = 0;

    public Cuenta(String nombrePersona, double saldo) {
        nombre = nombrePersona;

        if (saldo < 2000) {
            System.out.println("No alcanza saldo para abrir cuenta");
        } else {
            this.saldo = saldo;
            Random r = new Random();
            // crea un numero aleatorio entre 0-100
            noCuenta = r.nextInt(100);
            System.out.println("Cuenta " + noCuenta + " creada");
            cuentasCreadas++;
        }
    }

    public void imprimirTitular() {
        System.out.println("El titular de la cuenta es: " + this.nombre);
    }

    public void consultarSaldo() {
        System.out.println("El saldo de la cuenta es: " + this.saldo);
    }

    public void abonarSaldo(double saldoADepositar) {
        this.saldo = this.saldo + saldoADepositar;
    }

    public void retirarSaldo(double cantidadARetirar) {
        if (cantidadARetirar < 0) {
            System.out.println("Cantidad invalida para retirar");
        } else if (cantidadARetirar > this.saldo) {
            System.out.println("No tienes suficientes fondos p retirar");
        } else {
            this.saldo -= cantidadARetirar;
        }
    }
}
