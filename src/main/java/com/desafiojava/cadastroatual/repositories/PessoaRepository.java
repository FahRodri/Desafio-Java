package com.desafiojava.cadastroatual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafiojava.cadastroatual.entidades.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
