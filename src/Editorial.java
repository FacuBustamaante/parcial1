public class Editorial {
    private String nombre;
    private String sitioWeb;
    private Direccion direccion;
    private Libro libro;

    public Editorial(String nombre, String sitioWeb, Direccion direccion) {
        this.nombre = nombre;
        this.sitioWeb = sitioWeb;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", sitioWeb='" + sitioWeb + '\'' +
                ", direccion=" + direccion +
                ", libro=" + libro +
                '}';
    }
}
