package com.vagasempregopoa.service;

import com.vagasempregopoa.model.Vaga;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface VagaService {

    public Vaga criarVaga(Vaga vaga);

    public Vaga atualizarVaga(Vaga vaga);

    public void deleteVaga(Integer id);

    public List<Vaga> buscarVagas();

    public Optional<Vaga> buscarVagaPorId(Integer id);


}
