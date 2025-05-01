public class Ejemplar {
    private String codigo;
    private EstadoEjemplar estado;
    private Publicacion publicacion;

    public Ejemplar(String codigo, EstadoEjemplar estado, Publicacion publicacion) {
        this.codigo = codigo;
        this.estado = estado;
        this.publicacion = publicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public boolean estaDisponible(){
       if (estado == EstadoEjemplar.DISPONIBLE){
           System.out.println("El ejemplar esta disponible");
           return true;
       }
        System.out.println("El ejemplar no esta disponible");
       return false;
    }
    @Override
    public String toString() {
        return "Ejemplar{" +
                "codigo='" + codigo + '\'' +
                ", estado=" + estado +
                ", publicacion=" + publicacion +
                '}';
    }
}

