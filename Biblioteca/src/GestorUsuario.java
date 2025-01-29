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
}
