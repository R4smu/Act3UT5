public class GestorLibros {
    private libro[] Libros;
    private int numLibros;


    public GestorLibros() {
        this.Libros=new libro[20];
        this.numLibros=0;
    }

    public void NuevoLibro(libro Libro){
        Libros[numLibros]=Libro;
        numLibros++;
    }
}
