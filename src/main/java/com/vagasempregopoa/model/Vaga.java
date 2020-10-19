package com.vagasempregopoa.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Vaga {

    private Integer id;

    private String titulo;

    private String descricao;

    private String requisitos;

    private String salario;

    private String cidade;

    private String area;

}
