package semana11;
public class App {
    public static void main(String[] args) {
        Documento libro = new Libro("Heist", "Ariana Godoy", "normal", "445", false, "Wattpad", "59", "Romance");
        libro.prestar();
        libro.leer("Heist");
        libro.entregar();

        System.out.println("--------------------");

        Documento revista = new Revista("Cosmos", "Carl Sagan", "Digital", "0", true, "Planeta", 5);
        revista.prestar();
        revista.leer("Cosmos");
        revista.entregar();

        System.out.println("--------------------");

        Documento articulo = new Articulo("Tesis", "Tu Nombre", "PDF", "20", false, "CESDE", "Digital", "2026-05-12");
        articulo.prestar();
    }
}