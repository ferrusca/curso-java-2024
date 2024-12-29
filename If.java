public class If {
    public static void main(String[] args) {
        String color1 = "verde";
        String color2 = "amarillo";
        String color3 = new String("rojo");
        String semaforo = "verde";

        if (semaforo == color1)
            System.out.print("Automovil avanzando...");
        else if (semaforo == color2)
            System.out.print("Automovil frenando...");
        else {
            System.out.print("Automovil detenido...");
        }
        
        System.out.print("Aqui esta fuera...");
    }
}