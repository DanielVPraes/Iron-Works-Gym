package com.itb.tcc.inf2am.IronWorksGym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.itb.tcc.inf2am.IronWorksGym.model.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

}
