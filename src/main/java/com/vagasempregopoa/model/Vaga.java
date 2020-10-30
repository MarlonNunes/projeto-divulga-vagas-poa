package com.vagasempregopoa.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = true)
    @NotEmpty(message = "O campo titulo não pode estar vazio")
    private String titulo;

    @Column(nullable = false)
    @NotEmpty(message = "O campo descricao não pode estar vazio")
    private String descricao;

    @Column(nullable = false)
    @NotEmpty(message = "O campo requisito não pode estar vazio")
    private String requisitos;

    @Column(nullable = false)
    @NotEmpty(message = "O campo salario não pode estar vazio")
    private String salario;

    @Column(nullable = false)
    @NotEmpty(message = "O campo cidade não pode estar vazio")
    private String cidade;

    @Column(nullable = false)
    @NotEmpty(message = "O campo area não pode estar vazio")
    private String area;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate data;

    @PrePersist
    public void PrePersist(){
        setData(LocalDate.now());
    }
}
