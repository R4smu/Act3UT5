public class GestorUsuario {
    private usuario[] usuarios;
    private int numUsuarios;

    public GestorUsuario() {
        this.usuarios = new usuario[20];
        this.numUsuarios=0;
    }
    public void AñadirUsuario(usuario user){
        usuarios[numUsuarios]=user;
        numUsuarios++;
    }


}
