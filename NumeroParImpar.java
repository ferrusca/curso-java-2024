import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite;

        System.out.println("Hasta que numero quieres que cuente");
        limite = teclado.nextInt();

        for (int i = 1; i <= limite; ++i) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.printf("%d es impar\n", i);
            }

            if (i == limite) {
                System.out.println("Es el ultimo numero");
            }

            if (i % 10 == 0 && i != limite) {
                System.out.println();
            }

        }
        teclado.close();
    }
}

// Si es el ultimo numero, NO se imprime == "Si NO es el ultimo numero, SI se
// imprime"

// SI estas de vacaciones, no vas a la escuela == Si no estas de vacaciones, vas
// a la escuela

// Si usas la bici, no gastas en pasaje == Si no usas la bici, gastas en la
// pasaje
