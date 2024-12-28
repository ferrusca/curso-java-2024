public class Incremento {
    public static void main(String[] args) {
        int contador;

        contador = 5;
        System.out.println(contador);   // imprime 5
        System.out.println(contador++); // imprime 5, despues postincrementa
        System.out.println(contador);   // imprime 6
        System.out.println();    

        contador = 5;
        System.out.println(contador);    // imprime 5
        System.out.println(++contador);  // primero preincrementa, luego imprime 6
        System.out.println(contador);  // imprime 6
        System.out.println(); 

        contador = 5;
        System.out.println(++contador); // primero incrementa, luego imprime 6
        System.out.println(contador--); // imprime 6, luego decrementa
        System.out.println(--contador); // primero decrementa, luego imprime 4

    }
}