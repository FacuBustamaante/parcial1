import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ejemplar> ejemplares = new ArrayList<>();
        List<Autor> autores = new ArrayList<>();
        List<LineaPrestamo> lineas = new ArrayList<>();

        //Biblioteca
        Biblioteca biblioteca1 = new Biblioteca(new ArrayList<>(), new ArrayList<>());

        //Autores
        Autor autor1 = new Autor("JRR Tolkien", "Inglesa", new Date(1892 / 3));
        Autor autor2 = new Autor("Christopher Tolkien", "Inglesa", new Date(1924/11/21));

        autores.add(autor1);
        autores.add(autor2);

        //Editorial
        Editorial editorial1 = new Editorial("Editorial 1", "www.editorial1.com", new Direccion("Calle 1", 1));

        //Genero
        Genero genero1 = new Genero("Fantasía", "fantasia europa del este");

        //Libro
        Libro libro1 = new Libro("El silmarillion", 1977, ejemplares, genero1, "1234567890", autores, editorial1);
        System.out.println();

        //Ejemplares
        Ejemplar ejemplar1 = new Ejemplar("1", EstadoEjemplar.DISPONIBLE, libro1);
        Ejemplar ejemplar2 = new Ejemplar("2", EstadoEjemplar.DISPONIBLE, libro1);

        //Revista
        Revista revista1 = new Revista("Revista 1", 2019, ejemplares, genero1, 1, 1);
        biblioteca1.getPublicaciones().add(revista1);

        //Usuario
        LineaPrestamo lineaPrestamo1 = new LineaPrestamo(new Date(2025/4/12), ejemplar1);
        lineas.add(lineaPrestamo1);
        Prestamo prestamo1 = new Prestamo(new Date(2025/4/12), new Date(2025/5/12), lineas);
        Usuario usuario1 = new Usuario("Juan", "Perez", "1234567890", null);
        biblioteca1.getUsuarios().add(usuario1);


        ejemplares.add(ejemplar1);
        ejemplares.add(ejemplar2);

        libro1.getEjemplares().add(ejemplar1);
        libro1.getEjemplares().add(ejemplar2);

        System.out.println(biblioteca1);
    }
}
