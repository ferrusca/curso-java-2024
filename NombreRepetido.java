import java.util.Scanner;

public class NombreRepetido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreDelUsuario;
        int numeroRepeticiones;

        System.out.println("Dime tu nombre:");
        nombreDelUsuario = teclado.nextLine();

        System.out.println("Dime el numero de repeticiones (maximo 10):");
        numeroRepeticiones = teclado.nextInt();

        if (numeroRepeticiones <= 10) {
            for(int i = 0; i < numeroRepeticiones; i++) {
                System.out.println(nombreDelUsuario);
            }
        } else {
            System.err.println("Error, el maximo numero es 10");
        }
    }
}