import java.util.ArrayList;
import java.util.List;

public class Libro extends Publicacion{
    private String isbn;
    private List<Autor> autores;
    private Editorial editorial;

    public Libro(String titulo, int anio, List<Ejemplar> ejemplares, Genero genero, String isbn, List<Autor> autores, Editorial editorial) {
        super(titulo, anio, ejemplares, genero);
        this.isbn = isbn;
        this.autores = autores;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", autores=" + autores +
                ", editorial=" + editorial +
                '}';
    }
}
