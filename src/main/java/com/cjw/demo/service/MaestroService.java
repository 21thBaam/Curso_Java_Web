package com.cjw.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjw.demo.interfaceService.IMaestroService;
import com.cjw.demo.interfaces.IMaestro;
import com.cjw.demo.modelo.Maestro;

@Service
public class MaestroService implements IMaestroService{
	
	@Autowired
	private IMaestro data;
	
	@Override
	public List<Maestro> listar() {
		// TODO Auto-generated method stub
		return (List<Maestro>)data.findAll();
	}

	@Override
	public Optional<Maestro> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Maestro m) {
		int res=0;
		Maestro maestro=data.save(m);
		if(maestro.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}
}
