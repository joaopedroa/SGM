package br.com.bomdestino.sgm.carteiraprojetos.services;

import org.springframework.stereotype.Service;

import br.com.bomdestino.sgm.carteiraprojetos.models.Projeto;
import br.com.bomdestino.sgm.carteiraprojetos.repositorys.ProjetoRepository;

@Service
public class ProjetoServiceImpl implements ProjetoService{
	
	private final ProjetoRepository repository;
	
	public ProjetoServiceImpl(ProjetoRepository repository) {
		this.repository = repository;
	}

	@Override
	public void cadastrarProjeto(Projeto projeto) {
		this.repository.save(projeto);
		
	}

}
