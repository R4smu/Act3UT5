import java.util.Scanner;

public class GestorLibros {
    private Libro[] libros;
    private int numLibros;

    public GestorLibros() {
        libros = new Libro[5];
        numLibros = 0;
        libros[numLibros++] = new Libro("Las aventuras de Pepito Grillo", "Pepito", Categoria.AVENTURAS, false);
        libros[numLibros++] = new Libro("Gustavo 2: Más Gustavo Que Nunca", "Gustavo", Categoria.INFANTIL, false);
    }

    public void mostrarLibros() {
        if (numLibros == 0) {
            System.out.println("No hay libros disponibles.");
        } else {
            for (int i = 0; i < numLibros; i++) {
                System.out.println(libros[i]);
            }
        }
    }

    public void buscarLibro(Scanner scanner) {
        System.out.print("Introduce el título, autor o categoría del libro: ");
        String busqueda = scanner.nextLine().toLowerCase();
        boolean encontrado = false;
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getTitulo().toLowerCase().contains(busqueda) ||
                libros[i].getAutor().toLowerCase().contains(busqueda) ||
                libros[i].getCategoria().toString().toLowerCase().contains(busqueda)) {
                System.out.println(libros[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros con esa búsqueda.");
        }
    }

    public void agregarLibro(Scanner scanner) {
        if (numLibros == libros.length) {
            System.out.println("No se puede agregar más libros, capacidad máxima alcanzada.");
            return;
        }
        System.out.print("Introduce el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Introduce el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Introduce la categoría del libro: ");
        String categoria = scanner.nextLine().toUpperCase();
        Categoria categoriaEnum = Categoria.valueOf(categoria);
        libros[numLibros++] = new Libro(titulo, autor, categoriaEnum, false);
        System.out.println("Libro agregado exitosamente.");
    }

    public void eliminarLibro(Scanner scanner) {
        System.out.print("Introduce el título del libro a eliminar: ");
        String titulo = scanner.nextLine();
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                for (int j = i; j < numLibros - 1; j++) {
                    libros[j] = libros[j + 1];
                }
                libros[--numLibros] = null;
                System.out.println("Libro eliminado.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void realizarPrestamo(Scanner scanner, Usuario usuarioActivo) {
        System.out.print("Introduce el título del libro que deseas prestar: ");
        String titulo = scanner.nextLine();
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo) && !libros[i].getPrestado()) {
                libros[i].prestar();
                usuarioActivo.incrementarPrestamos();
                System.out.println("Libro prestado exitosamente.");
                return;
            }
        }
        System.out.println("El libro no está disponible o ya está prestado.");
    }

    public void devolverLibro(Scanner scanner, Usuario usuarioActivo) {
        System.out.print("Introduce el título del libro que deseas devolver: ");
        String titulo = scanner.nextLine();
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo) && libros[i].getPrestado()) {
                libros[i].devolver();
                usuarioActivo.decrementarPrestamos();
                System.out.println("Libro devuelto exitosamente.");
                return;
            }
        }
        System.out.println("No tienes ese libro prestado.");
    }

    public void mostrarEstadisticas() {
        int prestamosActivos = 0;
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getPrestado()) {
                prestamosActivos++;
            }
        }
        System.out.println("Total de préstamos activos: " + prestamosActivos);
    } 
}

