package com.vagasempregopoa.service.serviceImple;

import com.vagasempregopoa.model.Vaga;
import com.vagasempregopoa.repository.VagaRepository;
import com.vagasempregopoa.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VagaImplements implements VagaService {

    @Autowired
    VagaRepository vagaRepository;

    @Override
    public Vaga criarVaga(Vaga vaga) {
        return vagaRepository.save(vaga);
    }


        @Override
    public Vaga atualizarVaga(Vaga vaga) {
        return vagaRepository.save(vaga);
    }

    @Override
    public void deleteVaga(Integer id) {
        vagaRepository.deleteById(id);
    }

    @Override
    public List<Vaga> buscarVagas() {
        return vagaRepository.findAll();
    }

    @Override
    public Optional<Vaga> buscarVagaPorId(Integer id) {
        return vagaRepository.findById(id);
    }
}