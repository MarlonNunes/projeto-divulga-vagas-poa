package com.vagasempregopoa.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Usuario {

    private Integer id;

    private String nome;

    private String senha;

    private String email;

    private List<Vaga> publicacoes = new ArrayList<>();

}
