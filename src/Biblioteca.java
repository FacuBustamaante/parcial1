import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones;
    private List<Usuario> usuarios;

    public Biblioteca(List<Publicacion> publicaciones, List<Usuario> usuarios) {
        this.publicaciones = publicaciones;
        this.usuarios = usuarios;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "publicaciones=" + publicaciones +
                ", usuarios=" + usuarios +
                '}';
    }
}
