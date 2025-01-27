public class usuario{
    private String usuario;
    private String contraseña;
    private int numPrestados;
    private boolean admin;

    public usuario(){
        this.usuario = "";
        this.contraseña = "";
        this.numPrestados = 0;
        this.admin = false;
    }

    public usuario(String usuario, String contraseña, int numPrestados, boolean admin){
        this.usuario=usuario;
        this.contraseña=contraseña;
        this.numPrestados=numPrestados;
        this.admin=admin;
    }

    public String getUsuario(){return this.usuario;}
    public String getContraseña(){return this.contraseña;}
    public int getNumPrestados(){return this.numPrestados;}
    public boolean getAdmin(){return this.admin;}
    
    public void setUsuario(String usuario){this.usuario=usuario;}
    public void setContraseña(String contraseña){this.contraseña=contraseña;}
    public void setNumPrestados(int numPrestados){this.numPrestados=numPrestados;}
    public void setAdmin(boolean admin){this.admin=admin;}

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

