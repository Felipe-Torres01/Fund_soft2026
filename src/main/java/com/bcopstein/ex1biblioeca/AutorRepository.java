package com.bcopstein.ex1biblioeca;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Autor findByNome(String nome);
}
