package com.cjw.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.cjw.demo.modelo.Materia;

public interface IMateriaService {
	
	public List<Materia>listar();
	
	public Optional<Materia>listarId(int id);
	
	public int save(Materia m);
	
	public void delete(int id);
}
