import java.util.Scanner;

public class GestorUsuario {
    private Usuario[] usuarios;
    private int numUsuarios;

    public GestorUsuario() {
        usuarios = new Usuario[5];
        usuarios[numUsuarios++] = new Usuario("admin", "admin123", true, 0);
        usuarios[numUsuarios++] = new Usuario("usuario", "usuario123", false, 0);
    }

    public Usuario login(String usuario, String contraseña) {
        for (int i = 0; i < numUsuarios; i++) {
            if (usuarios[i].getUsuario().equals(usuario) && usuarios[i].verificarContraseña(contraseña)) {
                return usuarios[i];
            }
        }
        return null;
    }

    public void registrarUsuario(Scanner sc) {
        if (numUsuarios == usuarios.length) {
            System.out.println("No se pueden registrar más usuarios, capacidad máxima alcanzada.");
            return;
        }
        System.out.print("Introduce el usuario del nuevo usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Introduce la contraseña del nuevo usuario: ");
        String contraseña = sc.nextLine();
        usuarios[numUsuarios++] = new Usuario(usuario, contraseña, false, 0);
        System.out.println("Usuario registrado exitosamente.");
    }

    public void verUsuarios() {
        for (int i = 0; i < numUsuarios; i++) {
            System.out.println("Usuario: " + usuarios[i].getUsuario() + ", Admin: " + usuarios[i].getAdmin());
        }
    }

    public void mostrarUsuarioConMasPrestamos() {
        int maxPrestamos = -1;
        Usuario usuarioConMasPrestamos = null;

        for (int i = 0; i < numUsuarios; i++) {
            if (usuarios[i].getNumPrestados() > maxPrestamos) {
                maxPrestamos = usuarios[i].getNumPrestados();
                usuarioConMasPrestamos = usuarios[i];
            }
        }
        
        if (usuarioConMasPrestamos != null) {
            System.out.println("El usuario con más préstamos activos es: " + usuarioConMasPrestamos.getUsuario());
            System.out.println("Número de préstamos activos: " + usuarioConMasPrestamos.getNumPrestados());
        } else {
            System.out.println("No hay usuarios con préstamos activos.");
        }
    }
}
