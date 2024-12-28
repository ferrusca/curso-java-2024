import java.util.Scanner;

public class SumaDeEnteros {
    public static void main(String[] args) {
        // Atributos
        int a;
        int b;
        int resultado;
        String nombreDelUsuario;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        nombreDelUsuario = entrada.nextLine();

        System.out.println("Ingrese el primer numero");
        // Captura un entero desde el teclado
        a = entrada.nextInt();

        // captura un string desde el teclado
        entrada.nextLine();

        System.out.println("Captura el segundo numero");
        b = entrada.nextInt();

        resultado = a + b;

        System.out.printf("Hola %s, La suma de los dos numeros es %d", nombreDelUsuario, resultado);
    }

}
