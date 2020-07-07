package com.cjw.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.cjw.demo.modelo.Maestro;

public interface IMaestroService {

	public List<Maestro>listar();
	
	public Optional<Maestro>listarId(int id);
	
	public int save(Maestro m);
	
	public void delete(int id);
}
