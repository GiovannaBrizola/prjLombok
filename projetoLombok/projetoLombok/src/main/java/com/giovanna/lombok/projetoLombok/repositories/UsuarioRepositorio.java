package com.giovanna.lombok.projetoLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanna.lombok.projetoLombok.entities.*;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
}