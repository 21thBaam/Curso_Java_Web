package com.cjw.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjw.demo.modelo.usuario;

@Repository
public interface IUsuario extends CrudRepository<usuario, Integer>{

}
