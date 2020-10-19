package com.vagasempregopoa.repository;

import com.vagasempregopoa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Integer, Usuario> {
}
