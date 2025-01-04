import java.util.Scanner;

public class Direccion {
    public static void main(String[] args) {
        // variable local
        int opc;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("%cA d%cnde quieres ir ? \n (1)-Arriba\n(2)-Izquierda\n(3)-Derecha\n(4)-Abajo\n", 191, 243);
        opc = teclado.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Se mueve hacia arriba");
                break;
            case 2:
                System.out.println("Se mueve hacia la izquierda");
                break;
            case 3:
                System.out.println("Se mueve hacia la derecha");
                break;
            case 4:
                System.out.println("Se mueve hacia abajo");
                break;
            default:
                System.out.println("No se mueve");
                break;
        }

    }
}