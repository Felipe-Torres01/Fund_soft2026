package com.bcopstein.ex1biblioeca;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // Lado "inverso" do relacionamento: quem "dono" da associação é o Livro
    // (é lá que fica o @JoinTable). Aqui só espelhamos a lista.
    @ManyToMany(mappedBy = "autores")
    @JsonIgnoreProperties("autores")
    private List<Livro> livros = new ArrayList<>();

    public Autor() {
    }

    public Autor(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    @Override
    public String toString() {
        return "Autor [id=" + id + ", nome=" + nome + "]";
    }
}
