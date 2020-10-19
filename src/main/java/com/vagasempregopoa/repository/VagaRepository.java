package com.vagasempregopoa.repository;

import com.vagasempregopoa.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaRepository extends JpaRepository<Integer, Vaga> {
}
