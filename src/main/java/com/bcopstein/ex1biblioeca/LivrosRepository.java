package com.bcopstein.ex1biblioeca;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

    Livro findByTitulo(String titulo);

    // Spring Data JPA sabe montar o JOIN sozinho a partir do nome do método,
    // navegando de Livro -> autores -> nome
    List<Livro> findByAutoresNome(String nome);

    List<Livro> findByAutoresNomeAndAno(String nome, int ano);
}
