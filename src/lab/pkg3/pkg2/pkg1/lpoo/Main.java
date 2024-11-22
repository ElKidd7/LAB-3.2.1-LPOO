
package lab.pkg3.pkg2.pkg1.lpoo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Resena resena = new Resena("001", "Juan Pérez", new Date(), "Este es un contenido inicial.");
        
        resena.mostrarInfo();
        resena.compartir();
        resena.editarContenido("Contenido actualizado de la reseña.");
        
        resena.calificar(4);
        resena.calificar(5);
        System.out.println("Promedio de calificaciones: " + resena.obtenerPromedioCalificacion());
    }
}

