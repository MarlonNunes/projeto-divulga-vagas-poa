package com.vagasempregopoa.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String titulo;

    private String descricao;

    private String requisitos;

    private String salario;

    private String cidade;

    private String area;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate data;

    @PrePersist
    public void PrePersist(){
        setData(LocalDate.now());
    }
}
