
package lab.pkg3.pkg2.pkg1.lpoo;

import java.util.Date;

public abstract class Publicacion {
    protected String idPublicacion;
    protected String autor;
    protected Date fechaCreacion;
    protected String contenido;

    public Publicacion(String idPublicacion, String autor, Date fechaCreacion, String contenido) {
        this.idPublicacion = idPublicacion;
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
        this.contenido = contenido;
    }

    // Método abstracto para compartir la publicación
    public abstract void compartir();

    // Método abstracto para editar el contenido de la publicación
    public abstract void editarContenido(String nuevoContenido);

    // Método concreto
    public void mostrarInfo() {
        System.out.println("Publicación: " + idPublicacion + " por " + autor);
    }
}
