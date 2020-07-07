package com.cjw.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjw.demo.modelo.Maestro;

@Repository
public interface IMaestro extends CrudRepository<Maestro, Integer>{

}
