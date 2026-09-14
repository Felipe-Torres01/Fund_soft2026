import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Acervo{
    private List<Livro> livros;

    public Acervo() {
        livros = new LinkedList<>();
        livros.add(new Livro(100, "Aprendendo Spring-Boot", "Huguinho Pato", 2020));
        livros.add(new Livro(120, "Aprendendo Java", "Zezinho Pato", 2015));
        livros.add(new Livro(140, "Aprendendo Outra coisa", "Luizinho Pato", 2023));
        livros.add(new Livro(140, "Aprendendo Uma coisa nova", "Huguinho Pato", 2023));
        livros.add(new Livro(140, "Aprendendo Outra coisa nova", "Huguinho Pato", 2023));
    }
    public List<Livro> getALL(){
        return livros;
    }
}
