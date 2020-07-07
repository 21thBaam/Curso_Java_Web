package com.cjw.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjw.demo.modelo.Materia;

@Repository
public interface IMateria extends CrudRepository<Materia, Integer>{

}
