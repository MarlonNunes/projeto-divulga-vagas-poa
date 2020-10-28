package com.vagasempregopoa.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    @NotEmpty
    private String titulo;

    @Column(nullable = false)
    @NotEmpty
    private String descricao;

    @Column(nullable = false)
    @NotNull(message = "{vaga.requisito.nulo}")
    @NotEmpty
    private String requisitos;

    @Column(nullable = false)
    @NotEmpty
    private String salario;

    @Column(nullable = false)
    @NotEmpty
    private String cidade;

    @Column(nullable = false)
    @NotEmpty
    private String area;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate data;

    @PrePersist
    public void PrePersist(){
        setData(LocalDate.now());
    }
}
