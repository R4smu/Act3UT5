import java.util.Random;

public class persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private float peso;
    private float altura;

    public persona(){
        this.nombre="";
        this.edad=0;
        this.DNI = generarDNI();
        this.sexo='H';
        this.peso=0.f;
        this.altura=0.f;
    }

    public persona(String nombre, int edad, char sexo, float peso, float altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=comprobarGenero(sexo);
        this.DNI=generarDNI();
        this.peso=peso;
        this.altura=altura;
    }

    public persona(String nombre, int edad, char sexo){
        this();
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=comprobarGenero(sexo);
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float altura){
        this.altura=altura;
    }
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float peso){
        this.peso=peso;
    }
    public String getDNI(){
        return DNI;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo=comprobarGenero(sexo);
    }

    public int calculoIMC(){
        float imc = this.peso/(this.altura*this.altura);
        if (imc<20){return -1;}
        else if (imc>=20 && imc<=25){return 0;} 
        else {return 1;}
    }
    public boolean mayorEdad(){
        return this.edad>=18;}

    private char comprobarGenero(char generoPosible){
        if (this.sexo != 'M' || this.sexo != 'H'){
            return 'H';
        } else {return generoPosible;}
    }
    public String generarDNI(){
        Random r = new Random();
        int numero = r.nextInt(100_000_000);
        String DNI=String.format("%08d",numero);
        int letrasDNI = numero%23;
        String letras = "TRWAGMYFPDXB";
        DNI+=letras.charAt(letrasDNI);
        return DNI;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", DNI='" + getDNI() + "'" +
            ", sexo='" + getSexo() + "'" +
            ", peso='" + getPeso() + "'" +
            ", altura='" + getAltura() + "'" +
            "}";
    }



    
   
}