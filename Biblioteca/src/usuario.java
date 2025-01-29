public class Usuario{
    private String usuario;
    private String contraseña;
    private boolean admin;
    private int numPrestados;

    public Usuario() {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.admin = admin;
        this.numPrestados = numPrestados;
    }

    public Usuario(String usuario, String contraseña, boolean admin, int numPrestados) {
        usuario = "";
        contraseña = "";
        admin = false;
        numPrestados = 0;
    }

    public String getUsuario(){return this.usuario;}
    public String getContraseña(){return this.contraseña;}
    public boolean getAdmin(){return this.admin;}
    public int getNumPrestados(){return this.numPrestados;}
    
    public void setUsuario(String usuario){this.usuario=usuario;}
    public void setContraseña(String contraseña){this.contraseña=contraseña;}
    public void setAdmin(boolean admin){this.admin=admin;}
    public void setNumPrestados(int numPrestados){this.numPrestados=numPrestados;}

    public boolean verificarContraseña(String contraseña) {return this.contraseña.equals(contraseña);}
    public void incrementarPrestamos() {numPrestados++;}
    public void decrementarPrestamos() {numPrestados--;}

    @Override
    public String toString() {
        return "{" +
                " usuario='" + getUsuario() + "'" +
                ", contraseña='" + getContraseña() + "'" +
                ", numPrestados='" + getNumPrestados() + "'" +
                ", admin='" + getAdmin() + "'" +
                "}";
    }
}

