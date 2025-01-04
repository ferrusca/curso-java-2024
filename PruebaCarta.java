public class PruebaCarta {
    public static void main(String[] args) {
        Carta miPrimeraCarta = new Carta("Banamex", "Jorge Luis", "Le ofrecemos una tarjeta");
        Carta otraCarta = new Carta("Jorge", "Michael", "Haz tu tarea");

        System.out.println("El contenido de la carta 1 es " + miPrimeraCarta.getContenido());
        System.out.println("El contenido de la carta 2 es " + otraCarta.getContenido());
        otraCarta.contenido = "Hoy no hay tarea";

    }
}
