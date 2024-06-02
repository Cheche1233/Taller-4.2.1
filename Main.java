// Archivo Main.java en el directorio principal
import biblioteca.Biblioteca;
import biblioteca.Libro;

public class Main {
    public static void main(String[] args) {
        // Crear una biblioteca y algunos libros
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro libro2 = new Libro("Orgullo y prejuicio", "Jane Austen");

        // Agregar libros al inventario
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Mostrar el inventario
        biblioteca.mostrarInventario();
    }
}
