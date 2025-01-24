


public class usuario{
    private String nombre;
    private String usuario;
    private String contraseña;
    private boolean comprobarAdmin;
    private int numPrestados;

    public usuario(){
    this.nombre = " ";
    this.usuario=" ";
    this.contraseña="";
    this.numPrestados=0;
    }

    public usuario(String nombre, String usuario, String contraseña){
        this();
        this.nombre=nombre;
        this.usuario=usuario;
        this.contraseña=contraseña;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getUsuario(){
        return this.usuario;
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public String getContraseña(){
        return this.contraseña;
    }
    public void setContraseña(String contraseña){
        this.contraseña=contraseña;
    }
    public int getNumPrestados(){
        return this.numPrestados;
    }
    public void setNumPrestados(int numPrestados){
        this.numPrestados=numPrestados;
    }
    
    
}

