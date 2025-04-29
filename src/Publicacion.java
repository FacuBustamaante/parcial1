import java.util.ArrayList;
import java.util.List;

public class Publicacion {
    private String titulo;
    private int anio;
    private List<Ejemplar> ejemplares;
    private Genero genero;

    public Publicacion(String titulo, int anio, List<Ejemplar> ejemplares, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = new ArrayList<>();
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Ejemplar> getEjemplaresDisponibles(Publicacion publicacion){
        if(publicacion.getEjemplares() != null){
            for(Ejemplar ejemplar : publicacion.getEjemplares()){
                if(ejemplar.estaDisponible(ejemplar)){
                    return ejemplares;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", ejemplares=" + ejemplares +
                ", genero=" + genero +
                '}';
    }
}
