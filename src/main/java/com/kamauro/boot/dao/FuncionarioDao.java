package com.kamauro.boot.dao;

import java.util.List;

import com.kamauro.boot.model.Funcionario;

public interface FuncionarioDao {

    void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();

}
