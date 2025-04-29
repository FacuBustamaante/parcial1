import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autor autor2 = new Autor("Christopher Tolkien", "Inglesa", new Date(1967, 4, 22));
        Libro libro1 = new Libro("El silmarillion", 1947, new ArrayList<Ejemplar>(), new Genero("Fantasia", "nada"), "123456789", new ArrayList<Autor>(), new Editorial("HarperCollins", "tolkien.com", new Direccion("Calle de los 4", 123)));

        libro1.getAutores().add(new Autor("Christopher Tolkien", "Inglesa", new Date(1967, 4, 22)));
        libro1.getAutores().add(new Autor("JRR Tolkien", "Inglesa", new Date(1900, 1, 1)));

        libro1.getEjemplares().add(new Ejemplar("123456789", EstadoEjemplar.DISPONIBLE, libro1));
        libro1.getEjemplares().add(new Ejemplar("987654321", EstadoEjemplar.DISPONIBLE, libro1));

        Revista revista1 = new Revista("el silmarilion", 1980, new ArrayList<>(), new Genero("Fantasia", "nada"), 1, 1);
        Ejemplar ejemplar1 = new Ejemplar("123456789", EstadoEjemplar.DISPONIBLE, revista1);
        Ejemplar ejemplar2 = new Ejemplar("445968519", EstadoEjemplar.PRESTADO, revista1);

        Usuario usuario1 = new Usuario("Juan", "Perez", "123456789", new ArrayList<Prestamo>());

        usuario1.getPrestamos().add(new Prestamo(new Date(2025, 3, 6), new Date(2025, 4, 1 ), new ArrayList<LineaPrestamo>()));

        Biblioteca biblioteca1 = new Biblioteca(new ArrayList<Publicacion>(), new ArrayList<Usuario>());

        biblioteca1.getPublicaciones().add(libro1);
        biblioteca1.getPublicaciones().add(revista1);
        biblioteca1.getUsuarios().add(usuario1);

        System.out.println(biblioteca1);

    }
}
