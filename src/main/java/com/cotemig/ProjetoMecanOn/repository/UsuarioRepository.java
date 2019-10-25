package com.cotemig.ProjetoMecanOn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cotemig.ProjetoMecanOn.model.Usuario;

@Repository("usuarioRepository")
public interface  UsuarioRepository extends JpaRepository<Usuario, Integer> {

}