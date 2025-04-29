import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private List<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String dni, List<Prestamo> prestamos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.prestamos = prestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void mostrarHistorialPrestamos(){

    }
    public void mostrarHistorialPrestamos(Prestamo prestamo){
        if(prestamo.getLineas() != null){
            for(LineaPrestamo lineaPrestamo : prestamo.getLineas()){
                System.out.println(lineaPrestamo.getEjemplar().getPublicacion().getTitulo());
            }
        }

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", prestamos=" + prestamos +
                '}';
    }
}
