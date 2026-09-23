package com.bcopstein.ex1biblioeca;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<Livro,Long> { //jpa já te dá save, findAll, count, existsById, deleteById

    public List<Livro> findByAutor(String autor);

    public Livro findByTitulo(String titulo);

}
