package com.vagasempregopoa.service.serviceImple;

import com.vagasempregopoa.model.Usuario;
import com.vagasempregopoa.repository.UsuarioRepository;
import com.vagasempregopoa.service.UsuarioService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioImplements implements UsuarioService {

    UsuarioRepository usuarioRepository;

    @Override
    public void criaUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void atualizaUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void deletaUsuario(Integer id) {

    }
}
