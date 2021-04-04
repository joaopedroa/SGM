package br.com.bomdestino.sgm.carteiraprojetos.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bomdestino.sgm.carteiraprojetos.models.Projeto;
import br.com.bomdestino.sgm.carteiraprojetos.services.ProjetoService;

@RequestMapping("/projetos")
@RestController
public class ProjetoController {

	private final ProjetoService service;
	
	public ProjetoController(ProjetoService service) {
		this.service = service;
	}
	
	@PostMapping()
	public ResponseEntity<Void> cadastrarProjeto(@RequestBody Projeto projeto){
		this.service.cadastrarProjeto(projeto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping()
	public ResponseEntity<Page<Projeto>> getProjetos(Pageable pageble){
		Page<Projeto> projetos = this.service.getTodosProjetos(pageble);
		return new ResponseEntity<Page<Projeto>>(projetos, HttpStatus.OK);
	}
	
	@GetMapping(value="/total")
	public ResponseEntity<Integer> getTotalProjetos(){
		Integer totalProjetos = this.service.getTotalProjetos();
		return new ResponseEntity<Integer>(totalProjetos, HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteProject(@PathVariable Long id){
		this.service.deleteProjeto(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
