public class Livro {
    private String titulo;
    private String autor;
    private Number paginas;
    private String genero;

    //gets e sets das variaveis
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Number getPaginas() {
        return paginas;
    }
    public void setPaginas(Number paginas) {
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
