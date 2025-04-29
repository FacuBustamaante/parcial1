import java.util.Date;
import java.util.List;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private List<LineaPrestamo> lineas;

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, List<LineaPrestamo> lineas) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.lineas = lineas;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public List<LineaPrestamo> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaPrestamo> lineas) {
        this.lineas = lineas;
    }

    public void agregarLineaPrestamo(Ejemplar ejemplar){

    }


    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", lineas=" + lineas +
                '}';
    }
}
