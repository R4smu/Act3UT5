import java.util.Arrays;

public class GestorLibros {
    private libro[] Libros;
    private int numLibros;


    public GestorLibros() {
        this.Libros = new libro[20];
        this.numLibros = 0;
    }

    //-Crear nuevo libro
    public void nuevoLibro(libro nuevoLibro){
        if (numLibros<20){
            Libros[numLibros]= nuevoLibro;
            numLibros++;
        }
    }

    //-Buscar libro por:
    private int indiceLibro(String titulo) {
        int buscar = -1;
        for (int i = 0; i < numLibros && buscar == -1; i++) {
            if (Libros[i].getTitulo().equals(titulo)) {
                buscar = i;
            }
        }
        return buscar;
    }


    public libro buscarLibro(String titulo) {
        libro buscar = null;
        int indice = indiceLibro(titulo);
        if (indice != -1) {
            buscar = Libros[indice];
        }
        return buscar;
    }

    //titulo
    public libro[] buscarLibroTitulo(String titulo) {

        libro[] resultado = new libro[20];
        int tituloMax = 0;
        for (int i = 0; i < numLibros; i++) {
            if (Libros[i].getTitulo().equals(titulo)) {
                resultado[tituloMax] = Libros[i];
                tituloMax++;
            }
        }
        return Arrays.copyOf(resultado, tituloMax);
    }

    //autor
    public libro[] buscarLibroAutor(String autor) {

        libro[] resultado = new libro[20];
        int autorMax = 0;
        for (int i = 0; i < numLibros; i++) {
            if (Libros[i].getAutor().equals(autor)) {
                resultado[autorMax] = Libros[i];
                autorMax++;
            }
        }
        return Arrays.copyOf(resultado, autorMax);
    }

    //categoria
    public libro[] buscarLibroCategoria(Categoria categoria) {

        libro[] resultado = new libro[20];
        int categoriaMax = 0;
        for (int i = 0; i < numLibros; i++) {
            if (Libros[i].getCategoria().equals(categoria)) {
                resultado[categoriaMax] = Libros[i];
                categoriaMax++;
            }
        }
        return Arrays.copyOf(resultado, categoriaMax);
    }

    //-Eliminar libro existente:
    public boolean eliminarLibro(String titulo) {
        int indice = indiceLibro(titulo);
        if (indice != -1) {
            for (int i = indice; i < numLibros - 1; i++) {
                Libros[i] = Libros[i + 1];
            }
            Libros[--numLibros] = null;
            return true;
        } else {
            return false;
        }
    }

    //Mostrar todos los libros existentes
    public static String toString(libro[] arrayLibro){
        String stringLibro = "";
        for (libro libro : arrayLibro) {
            stringLibro += libro.toString() + "\n";
        }
        return stringLibro;
    }
}
