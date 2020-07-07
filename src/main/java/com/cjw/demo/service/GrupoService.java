package com.cjw.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjw.demo.interfaceService.lGrupoService;
import com.cjw.demo.interfaces.lGrupo;
import com.cjw.demo.modelo.Grupo;

@Service
public class GrupoService implements lGrupoService{
	
	@Autowired
	private lGrupo data;
	
	@Override
	public List<Grupo> listar() {
		// TODO Auto-generated method stub
		return (List<Grupo>)data.findAll();
	}

	@Override
	public Optional<Grupo> listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int save(Grupo g) {
		int res=0;
		Grupo grupo=data.save(g);
		if(grupo.equals(null)) {
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
