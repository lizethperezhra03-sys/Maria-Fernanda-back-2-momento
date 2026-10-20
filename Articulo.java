package semana11;
public class Articulo extends Documento {
    private String tipoAlmacenamiento;
    private String fechaPublicacion; // NUEVO

    public Articulo(String tipoAlmacenamiento, String fechaPublicacion) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Articulo(String nombre, String autor, String tipoPasta, String numeroHojas, boolean esIlustrado, String editorial, String tipoAlmacenamiento, String fechaPublicacion) {
        super(nombre, autor, tipoPasta, numeroHojas, esIlustrado, editorial);
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTipoAlmacenamiento() { return tipoAlmacenamiento; }
    public void setTipoAlmacenamiento(String tipoAlmacenamiento) { this.tipoAlmacenamiento = tipoAlmacenamiento; }
    public String getFechaPublicacion() { return fechaPublicacion; }
    public void setFechaPublicacion(String fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }

    @Override
    public void prestar() {
        System.out.println("El articulo " + getNombre() + " del " + fechaPublicacion + " esta siendo prestado");
    }
}