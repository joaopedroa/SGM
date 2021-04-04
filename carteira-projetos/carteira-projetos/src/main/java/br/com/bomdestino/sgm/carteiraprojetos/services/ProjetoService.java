package br.com.bomdestino.sgm.carteiraprojetos.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.bomdestino.sgm.carteiraprojetos.models.Projeto;

public interface ProjetoService {

	void cadastrarProjeto(Projeto projeto);
	
	Page<Projeto> getTodosProjetos(Pageable pageable);
	
	Integer getTotalProjetos();
	
	void deleteProjeto(Long id);
}
