package com.vagasempregopoa.service;

import com.vagasempregopoa.model.Vaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VagaService {

    @Autowired
    Vaga vaga;

    public void creationVaga(String titulo, String descricao, String requisitos, String salario, String cidade, String area){

    }

    public void updateVaga(Integer id, String titulo, String descricao, String requisitos, String salario, String cidade, String area){

    }

    public void deleteVaga(Integer id){

    }












}
