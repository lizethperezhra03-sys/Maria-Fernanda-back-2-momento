package semana11;
public class Revista extends Documento {
    private int numeroEdicion; // NUEVO

    public Revista() {}
    
    public Revista(String nombre, String autor, String tipoPasta, String numeroHojas, boolean esIlustrado, String editorial, int numeroEdicion) {
        super(nombre, autor, tipoPasta, numeroHojas, esIlustrado, editorial);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() { return numeroEdicion; }
    public void setNumeroEdicion(int numeroEdicion) { this.numeroEdicion = numeroEdicion; }

    @Override
    public void prestar() {
        System.out.println("La revista " + getNombre() + " edicion #" + numeroEdicion + " esta siendo prestada");
    }
}