package com.kamauro.boot.dao;

import java.util.List;

import com.kamauro.boot.model.Cargo;

public interface CargoDao {

    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();

}
