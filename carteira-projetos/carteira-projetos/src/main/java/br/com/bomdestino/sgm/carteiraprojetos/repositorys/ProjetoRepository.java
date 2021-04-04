package br.com.bomdestino.sgm.carteiraprojetos.repositorys;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.bomdestino.sgm.carteiraprojetos.models.Projeto;

@Repository
public interface ProjetoRepository extends PagingAndSortingRepository<Projeto, Long>{
	
	
}
