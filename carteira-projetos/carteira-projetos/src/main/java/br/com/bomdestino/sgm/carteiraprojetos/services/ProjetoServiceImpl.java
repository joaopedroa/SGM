package br.com.bomdestino.sgm.carteiraprojetos.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	@Override
	public Page<Projeto> getTodosProjetos(Pageable pageable) {
		System.out.println(this.repository.findAll(pageable));
		return this.repository.findAll(pageable);
	}

	@Override
	public void deleteProjeto(Long id) {
		this.repository.deleteById(id);
		
	}

	@Override
	public Integer getTotalProjetos() {
		List<Projeto> projetos = (List<Projeto>) this.repository.findAll();
		if(projetos == null)
			return 0;
			
		return projetos.size();
	}

}
