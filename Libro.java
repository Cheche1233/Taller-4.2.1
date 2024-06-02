// Dentro del paquete "biblioteca"
package biblioteca;

// Clase Libro
public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    // Método para prestar el libro
    public void prestarLibro() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro " + titulo + " ha sido prestado.");
        } else {
            System.out.println("El libro " + titulo + " ya está prestado.");
        }
    }

    // Método para devolver el libro
    public void devolverLibro() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro " + titulo + " ha sido devuelto.");
        } else {
            System.out.println("El libro " + titulo + " no estaba prestado.");
        }
    }

    // Método para actualizar el estado del libro
    public void actualizarEstado() {
        // Lógica para actualizar el estado del libro (ejemplo simplificado)
    }
}
