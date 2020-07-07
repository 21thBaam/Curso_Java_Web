package com.cjw.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjw.demo.interfaceService.IMateriaService;
import com.cjw.demo.interfaces.IMateria;
import com.cjw.demo.modelo.Materia;

@Service
public class MateriaService implements IMateriaService{
	
	@Autowired
	private IMateria data;

	@Override
	public List<Materia> listar() {
		// TODO Auto-generated method stub
		return (List<Materia>)data.findAll();
	}

	@Override
	public Optional<Materia> listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int save(Materia m) {
		int res=0;
		Materia materia=data.save(m);
		if(materia.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}
	
	
}
