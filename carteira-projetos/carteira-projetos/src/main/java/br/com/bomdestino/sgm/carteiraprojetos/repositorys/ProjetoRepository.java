package br.com.bomdestino.sgm.carteiraprojetos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bomdestino.sgm.carteiraprojetos.models.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long>{

}
