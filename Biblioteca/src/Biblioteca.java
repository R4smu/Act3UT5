import java.util.Scanner;
/*
 * @autor: Lucas Rasmussen Marcos y Jhansell García Vargas
 */
public class Biblioteca {
    public static void main(String[] args) {
        GestorLibros gestorLibros = new GestorLibros();
        GestorUsuario gestorUsuario = new GestorUsuario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Sistema de Gestión de Biblioteca Digital");

        while (true) {
            System.out.print("Nombre de usuario: ");
            String nombre = scanner.nextLine();
            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();

            Usuario usuarioActivo = gestorUsuario.login(nombre, contrasena);
            if (usuarioActivo != null) {
                System.out.println("¡Bienvenido, " + nombre + "!");
                mostrarMenu(gestorLibros, gestorUsuario, usuarioActivo, scanner);
            } else {
                System.out.println("Usuario o contraseña incorrectos.");
            }
        }
    }

    private static void mostrarMenu(GestorLibros gestorLibros, GestorUsuario gestorUsuario, Usuario usuarioActivo, Scanner scanner) {
        int opcion;
    
        do {
            System.out.println("\n--- Menú Biblioteca ---");
            System.out.println("1. Mostrar todos los libros");
            System.out.println("2. Buscar libro");
            System.out.println("3. Realizar préstamo");
            System.out.println("4. Devolver libro");
            if (usuarioActivo.getAdmin()) {
                System.out.println("5. Agregar libro");
                System.out.println("6. Eliminar libro");
                System.out.println("7. Registrar usuario");
                System.out.println("8. Ver usuarios");
                System.out.println("9. Mostrar estadísticas");
                System.out.println("10. Mostrar libros más prestados");
                System.out.println("11. Mostrar usuario con más préstamos activos");
            }
            System.out.println("12. Cerrar sesión");
            System.out.println("13. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
    
            switch (opcion) {
                case 1:
                    gestorLibros.mostrarLibros();
                    break;
                case 2:
                    gestorLibros.buscarLibro(scanner);
                break;
                case 3:
                    gestorLibros.realizarPrestamo(scanner, usuarioActivo);
                break;
                case 4:
                    gestorLibros.devolverLibro(scanner, usuarioActivo);
                    break;
                case 5:
                    if (usuarioActivo.getAdmin()) {
                        gestorLibros.agregarLibro(scanner);
                    }
                    break;
                case 6:
                    if (usuarioActivo.getAdmin()) {
                        gestorLibros.eliminarLibro(scanner);
                    }
                    break;
                case 7:
                    if (usuarioActivo.getAdmin()) {
                        gestorUsuario.registrarUsuario(scanner);
                    }
                    break;
                case 8:
                    if (usuarioActivo.getAdmin()) {
                        gestorUsuario.verUsuarios();
                    }
                    break;
                case 9:
                    if (usuarioActivo.getAdmin()) {
                        gestorLibros.mostrarEstadisticas();
                    }
                    break;
                case 10:
                    System.out.println("Cerrando sesión...");
                    return;
                case 11:
                    System.out.println("Saliendo...");
                    System.exit(0); 
                    break;
                case 12:
                    if (usuarioActivo.getAdmin()) {
                        gestorLibros.mostrarLibrosMasPrestados();
                    }
                    break;
                case 13:
                    if (usuarioActivo.getAdmin()) {
                        gestorUsuario.mostrarUsuarioConMasPrestamos();
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (true);
    }
}


