public class Livros {
    private int id;
    private int ano;
    private String titulo;
    private String autor;

    public Livros (int id, int ano, String titulo, String autor){
        this.id = id;
        this.ano = ano;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId(){
        return id;
    }
    public int getAno(){
        return ano;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
}

