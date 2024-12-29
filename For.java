import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite;

        System.out.println("Hasta qué numero quieres que cuente?");
        limite = entrada.nextInt();

        int contador;

        for(contador = 1; contador <= limite; contador++) {
            System.out.println("El contador vale: " + contador);
        }
        System.out.println("VALOR final de contador es: " + contador);

        System.out.println("\nINVERSO\n");

        for(int i = limite;i >= 1; i = i - 1) {
            System.out.println("El contador vale " + i);
        }
        // ESTO NO SE PUEDE HACER (esta fuera del for)
        // System.out.println(i);
    }
}