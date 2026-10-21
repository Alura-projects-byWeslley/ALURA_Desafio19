package br.com.gattigit.alura_gerenciar_pedidos.models;

import jakarta.persistence.*;

@Entity
public class Categoria {
    @Id
    private Long id;
    private String nome;

    public Categoria(){}

    public Categoria(Long id, String nome){
        this.nome = nome;
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }
}
