// Archivo Biblioteca.java dentro del directorio "biblioteca"
package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> inventario;

    // Constructor
    public Biblioteca() {
        this.inventario = new ArrayList<>();
    }

    // Método para agregar un libro al inventario
    public void agregarLibro(Libro libro) {
        inventario.add(libro);
        System.out.println("Libro agregado al inventario: " + libro.getTitulo());
    }

    // Método para mostrar el inventario de libros
    public void mostrarInventario() {
        System.out.println("Inventario de la biblioteca:");
        for (Libro libro : inventario) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }
    }

    // Método main para probar la funcionalidad de la biblioteca
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry");

        // Agregar libros al inventario
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Mostrar el inventario
        biblioteca.mostrarInventario();
    }
}
