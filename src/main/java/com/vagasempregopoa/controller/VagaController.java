package com.vagasempregopoa.controller;

import com.vagasempregopoa.model.Vaga;
import com.vagasempregopoa.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/vagas")
public class VagaController {
    // INJETANDO A DEPENDÊNCIA
    @Autowired
    VagaService vagaService;


    //CRIANDO AS VAGAS
    @PostMapping(value = "/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public Vaga criar(@RequestBody @Valid Vaga vaga){

        return vagaService.criarVaga(vaga);
    }


    //BUSCANDO TODAS AS VAGAS
    @GetMapping(value = "/buscar")
    public List<Vaga> buscarTodas(){
        return vagaService.buscarVagas();
    }


    //BUSCANDO UMA VAGA ESPECÍFICA POR ID
    @GetMapping(value = "/buscar/{id}")
    public Vaga buscarPorId(@PathVariable Integer id) {

        return vagaService.buscarVagaPorId(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
