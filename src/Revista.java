import java.util.List;

public class Revista extends Publicacion {
    private int volumen;
    private int numero;

    public Revista(String titulo, int anio, List<Ejemplar> ejemplares, Genero genero, int volumen, int numero) {
        super(titulo, anio, ejemplares, genero);
        this.volumen = volumen;
        this.numero = numero;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "volumen=" + volumen +
                ", numero=" + numero +
                '}';
    }
}
