package semana11;

public abstract class Documento {
    private String nombre;
    private String autor;
    private String tipoPasta;
    private String numeroHojas;
    private boolean esIlustrado;
    private String editorial; // NUEVO

    public Documento() {}

    public Documento(String nombre, String autor, String tipoPasta, String numeroHojas, boolean esIlustrado, String editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.tipoPasta = tipoPasta;
        this.numeroHojas = numeroHojas;
        this.esIlustrado = esIlustrado;
        this.editorial = editorial;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public String getTipoPasta() { return tipoPasta; }
    public void setTipoPasta(String tipoPasta) { this.tipoPasta = tipoPasta; }
    public String getNumeroHojas() { return numeroHojas; }
    public void setNumeroHojas(String numeroHojas) { this.numeroHojas = numeroHojas; }
    public boolean isEsIlustrado() { return esIlustrado; }
    public void setEsIlustrado(boolean esIlustrado) { this.esIlustrado = esIlustrado; }
    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public abstract void prestar();
    public void leer(String nombre) {
        System.out.println("El libro " + nombre + " esta siendo leido");
    }
    public void entregar() {
        System.out.println("Esta siendo entregado");
    }
}