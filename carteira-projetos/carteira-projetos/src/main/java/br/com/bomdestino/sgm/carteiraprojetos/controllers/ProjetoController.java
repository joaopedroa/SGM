package br.com.bomdestino.sgm.carteiraprojetos.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
}
