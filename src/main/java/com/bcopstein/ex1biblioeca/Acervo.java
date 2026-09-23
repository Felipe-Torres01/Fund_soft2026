package com.bcopstein.ex1biblioeca;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class Acervo {
    private final LivrosRepository livroRepository;
    private final AutorRepository autorRepository;

    @Autowired
    public Acervo(LivrosRepository livroRepository, AutorRepository autorRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
    }

    @PostConstruct
    public void init() {
        if (livroRepository.count() == 0) {
            Autor huguinho = new Autor("Huguinho Pato");
            Autor zezinho = new Autor("Zezinho Pato");
            Autor luizinho = new Autor("Luizinho Pato");
            Autor lala = new Autor("Lala Pato");

            cadastraLivroNovo(new Livro("Introdução ao Java", 2022), List.of(huguinho));
            cadastraLivroNovo(new Livro("Introdução ao Spring-Boot", 2020), List.of(zezinho));
            cadastraLivroNovo(new Livro("Principios SOLID", 2023), List.of(luizinho));
            cadastraLivroNovo(new Livro("Padroes de Projeto", 2019), List.of(lala));
            cadastraLivroNovo(new Livro("Usando JPA", 2026), List.of(lala, luizinho));
        }
    }

    public List<Livro> getAll() {
        return livroRepository.findAll();
    }

    public List<String> getTitulos() {
        return getAll()
                .stream()
                .map(Livro::getTitulo)
                .toList();
    }

    public List<String> getAutores() {
        return autorRepository.findAll()
                .stream()
                .map(Autor::getNome)
                .toList();
    }

    public List<Livro> getLivrosDoAutor(String autor) {
        return livroRepository.findByAutoresNome(autor);
    }

    public List<Livro> getLivrosDoAutor(String autor, int ano) {
        return livroRepository.findByAutoresNomeAndAno(autor, ano);
    }

    public Livro getLivroTitulo(String titulo) {
        return livroRepository.findByTitulo(titulo);
    }

    public boolean cadastraLivroNovo(Livro livro) {
        livroRepository.save(livro);
        return true;
    }

    public  boolean cadastraLivroNovo(Livro livro, List<Autor> autoresDoCorpo) {
    List<Autor> autoresParaAssociar = new ArrayList<>();
    for (Autor autor : autoresDoCorpo) {
        Autor existente = autorRepository.findByNome(autor.getNome());
        autoresParaAssociar.add(existente != null ? existente : autorRepository.save(autor));
    }
    livro.setAutores(autoresParaAssociar);
    livroRepository.save(livro);
    return true;
}
    public boolean removeLivro(long codigo) {
        if (livroRepository.existsById(codigo)) {
            livroRepository.deleteById(codigo);
            return true;
        }
        return false;
    }
}