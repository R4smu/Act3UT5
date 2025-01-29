public class Libro {
    private String titulo;
    private String autor;
    private Categoria categoria;
    private boolean prestado;

    public Libro(String titulo, String autor, Categoria categoria, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.prestado = prestado;
    }

    public String getTitulo(){return this.titulo;}
    public String getAutor(){return this.autor;}
    public Categoria getCategoria(){return this.categoria;}
    public boolean getPrestado(){return this.prestado;}

    public void setTitulo(String titulo){this.titulo=titulo;}
    public void setAutor(String autor){this.autor=autor;}
    public void setCategoria(Categoria categoria){this.categoria=categoria;}
    public void setPrestado(boolean prestado){this.prestado=prestado;}

    public void prestar() {this.prestado = true;}
    public void devolver() {this.prestado = false;}

    @Override
    public String toString() {
    return "Título: " + getTitulo() + ", Autor: " + getAutor() + ", Categoría: " + getCategoria() + ", Prestado: " + (getPrestado() ? "Sí" : "No");
}
}
