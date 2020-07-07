package com.cjw.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjw.demo.modelo.Grupo;

@Repository
public interface lGrupo extends CrudRepository<Grupo, Integer>{

}
