
package lab.pkg3.pkg2.pkg1.lpoo;

import java.util.ArrayList;
import java.util.Date;

public class Resena extends Publicacion implements Calificable {
    private ArrayList<Integer> calificaciones;

    public Resena(String idPublicacion, String autor, Date fechaCreacion, String contenido) {
        super(idPublicacion, autor, fechaCreacion, contenido);
        this.calificaciones = new ArrayList<>();
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo reseña: " + contenido);
    }

    @Override
    public void editarContenido(String nuevoContenido) {
        this.contenido = nuevoContenido;
        System.out.println("Contenido actualizado: " + nuevoContenido);
    }

    @Override
    public void calificar(int puntuacion) {
        if (puntuacion >= 1 && puntuacion <= 5) {
            calificaciones.add(puntuacion);
            System.out.println("Calificación añadida: " + puntuacion);
        } else {
            System.out.println("La puntuación debe estar entre 1 y 5.");
        }
    }

    @Override
    public double obtenerPromedioCalificacion() {
        return calificaciones.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}
