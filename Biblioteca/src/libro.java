public class libro {
    private String titulo;
    private String autor;
    private Categoria categoria;
    private boolean disponible;

    public libro(){
        this.titulo = "";
        this.autor = "";
        this.categoria = null;
        this.disponible = true;
    }

    public libro(String titulo, String autor, Categoria categoria, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public String getTitulo(){return this.titulo;}
    public String getAutor(){return this.autor;}
    public Categoria getCategoria(){return this.categoria;}
    public boolean getDisponible(){return this.disponible;}

    public void setTitulo(String titulo){this.titulo=titulo;}
    public void setAutor(String autor){this.autor=autor;}
    public void setCategoria(Categoria categoria){this.categoria=categoria;}
    public void setDisponible(boolean disponible){this.disponible=disponible;}
}
