package com.cjw.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.cjw.demo.modelo.Grupo;

public interface lGrupoService {
	
	public List<Grupo>listar();
	
	public Optional<Grupo>listarId(int id);
	
	public int save(Grupo g);
	
	public void delete(int id);
}
