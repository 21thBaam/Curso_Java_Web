package com.cjw.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cjw.demo.interfaceService.IAlumnoService;
import com.cjw.demo.interfaceService.IMaestroService;
import com.cjw.demo.interfaceService.IMateriaService;
import com.cjw.demo.modelo.Alumno;
import com.cjw.demo.modelo.Greeting;
import com.cjw.demo.modelo.Maestro;
import com.cjw.demo.modelo.Materia;

@Controller
public class controlardor {
	
	@Autowired
	private IMaestroService Mservice;
	@Autowired
	private IAlumnoService Aservice;
	@Autowired
	private IMateriaService MAservice;
	
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	
	//*******
	//Inscribir Materia
	//*******
	@GetMapping("/alumno")
	public String alumno(Model model) {
		model.addAttribute("materia", new Materia());
		return "alumno";
	}
	
	@PostMapping("/materia/save")
	public String save(@Validated Materia ma, Model model) {
		MAservice.save(ma);
		return "redirect:/alumno";
	}
	
	@GetMapping("/maestro")
	public String maestro() {
		return "maestro";
	}
	
	@GetMapping("/admin")
	public String listar(Model model) {
		List<Maestro>maestros = Mservice.listar();
		model.addAttribute("maestros", maestros);
		List<Alumno>alumnos = Aservice.listar();
		model.addAttribute("alumnos", alumnos);
		return "admin";
	}
	
	//*******
	//Maestro
	//*******
	@GetMapping("/maestro/new")
	public String agregar(Model model) {
		model.addAttribute("maestro", new Maestro());
		return "form-maestro";
	}
	
	@GetMapping("/maestro/editar/{id}")
	public String editar(@PathVariable int id, Model modelo) {
		Optional<Maestro> maestro = Mservice.listarId(id);
		modelo.addAttribute("maestro", maestro);
		return "form-maestro";
	}
	
	@PostMapping("/maestro/save")
	public String save(@Validated Maestro m, Model model) {
		Mservice.save(m);
		return "redirect:/admin";
	}
	
	@GetMapping("/maestro/eliminar/{id}")
	public String delete(@PathVariable int id, Model modelo) {
		Mservice.delete(id);
		return "redirect:/admin";
	}
	//*******
	//Alumno
	//*******
	@GetMapping("/alumno/new")
	public String agregarAlumno(Model model) {
		model.addAttribute("alumno", new Alumno());
		return "form-alumno";
	}
	
	@GetMapping("/alumno/editar/{id}")
	public String editarAlumno(@PathVariable int id, Model modelo) {
		Optional<Alumno> alumno = Aservice.listarId(id);
		modelo.addAttribute("alumno", alumno);
		return "form-alumno";
	}
	
	@PostMapping("/alumno/save")
	public String saveAlumno(@Validated Alumno a, Model model) {
		Aservice.save(a);
		return "redirect:/admin";
	}
	
	@GetMapping("/alumno/eliminar/{id}")
	public String deleteAlumno(@PathVariable int id, Model modelo) {
		Aservice.delete(id);
		return "redirect:/admin";
	}
}
