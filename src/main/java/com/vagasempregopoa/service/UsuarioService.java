package com.vagasempregopoa.service;

import com.vagasempregopoa.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UsuarioService {

    public void criaUsuario(Usuario usuario);

    public void atualizaUsuario(Usuario usuario);

    public void deletaUsuario(Integer id);
}
