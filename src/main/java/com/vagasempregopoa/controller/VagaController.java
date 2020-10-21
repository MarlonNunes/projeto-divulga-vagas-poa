package com.vagasempregopoa.controller;

import com.vagasempregopoa.model.Vaga;
import com.vagasempregopoa.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vagas")
@Controller
public class VagaController {
    // INJETANDO A DEPENDÊNCIA
    @Autowired
    VagaService vagaService;


    //CRIANDO AS VAGAS
    @PostMapping(value = "/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public Vaga criar(@RequestBody Vaga vaga){

        return vagaService.criarVaga(vaga);
    }


    //BUSCANDO TODAS AS VAGAS
    @GetMapping(value = "/buscar")
    @ResponseStatus(HttpStatus.OK)
    public List<Vaga> buscarTodas(){
        return vagaService.buscarVagas();
    }


    //BUSCANDO UMA VAGA ESPECÍFICA POR ID
    @GetMapping(value = "/buscar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Vaga buscarPorId(@PathVariable Integer id){
        try {
            return vagaService.buscarVagaPorId(id);

        }catch (Exception e){
            return vagaService.buscarVagas().get(0);
        }
    }


}
