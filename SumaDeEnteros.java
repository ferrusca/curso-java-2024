import java.util.Scanner;

public class SumaDeEnteros {
    public static void main(String[] args) {
        // Atributos
        int a;
        int b;
        int resultado;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        // Captura desde el teclado
        a = entrada.nextInt();

        System.out.println("Captura el segundo numero");
        b = entrada.nextInt();

        resultado = a + b;

        System.out.printf("La suma de los dos numeros es %d", resultado);
    }

}
