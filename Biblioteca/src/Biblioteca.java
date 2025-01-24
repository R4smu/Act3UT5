import java.util.Scanner;

public class Biblioteca {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        GestorLibros Libros = new GestorLibros();

        System.out.println("Dime el titulo del libro");
        String titulo = sc.nextLine();
        System.out.println("Dime el autor del libro");
        String autor = sc.nextLine();
        System.out.println("Dime la categoria del libro");
        String categoria = sc.nextLine();
        libro LibAñadir = new libro(titulo, autor, categoria);
        Libros.NuevoLibro(null);
    }
}
