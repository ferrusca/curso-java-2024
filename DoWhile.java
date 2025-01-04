import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int numeroIngresado;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Ingresa el numero 5 para salir");
            numeroIngresado = teclado.nextInt();
        } while (numeroIngresado != 5);

        System.out.println("Saliendo...");
        teclado.close();
    }
}