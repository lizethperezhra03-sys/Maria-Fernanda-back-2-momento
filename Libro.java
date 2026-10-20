package semana11;
public class Libro extends Documento {
    private String capitulos;
    private String generoLiterario; // NUEVO

    public Libro(String capitulos, String generoLiterario) {
        this.capitulos = capitulos;
        this.generoLiterario = generoLiterario;
    }

    public Libro(String nombre, String autor, String tipoPasta, String numeroHojas, boolean esIlustrado, String editorial, String capitulos, String generoLiterario) {
        super(nombre, autor, tipoPasta, numeroHojas, esIlustrado, editorial);
        this.capitulos = capitulos;
        this.generoLiterario = generoLiterario;
    }

    public String getCapitulos() { return capitulos; }
    public void setCapitulos(String capitulos) { this.capitulos = capitulos; }
    public String getGeneroLiterario() { return generoLiterario; }
    public void setGeneroLiterario(String generoLiterario) { this.generoLiterario = generoLiterario; }

    @Override
    public void prestar() {
        System.out.println("El libro " + getNombre() + " (" + generoLiterario + ") esta siendo prestado");
    }
    @Override
    public void entregar() {
        System.out.println("El libro " + getNombre() + " esta siendo entregado");
    }
}