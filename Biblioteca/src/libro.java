

public class libro {
    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponible;

    //Constructor por defecto
    public libro() {
        this.titulo = "";
        this.autor = "";
        this.categoria = ""; 
    }

    //Constructor parametrizado
    public libro(String titulo, String autor, String categoria) {
        this();
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }
    //Todos los libros registrados desde el principio han de estar parametrizados (valores específicos)

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }

}
