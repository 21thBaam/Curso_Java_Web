package com.cjw.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjw.demo.modelo.Alumno;

@Repository
public interface IAlumno extends CrudRepository<Alumno, Integer>{

}
