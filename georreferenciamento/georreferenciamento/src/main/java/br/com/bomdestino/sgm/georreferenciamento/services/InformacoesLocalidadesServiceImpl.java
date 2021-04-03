package br.com.bomdestino.sgm.georreferenciamento.services;

import org.springframework.stereotype.Service;

import br.com.bomdestino.sgm.georreferenciamento.models.InformacoesMunicipios;
import br.com.bomdestino.sgm.georreferenciamento.repositorys.InformacoesLocalidadesRepository;

@Service
public class InformacoesLocalidadesServiceImpl implements InformacoesLocalidadesService {
	
	private final InformacoesLocalidadesRepository repository;
	
	public InformacoesLocalidadesServiceImpl(InformacoesLocalidadesRepository repository) {
		this.repository = repository;
	}

	@Override
	public void cadastrarInformacoesMunicipio(InformacoesMunicipios infos) {
		this.repository.save(infos);
	}

	@Override
	public InformacoesMunicipios getInfoPorMunicipio(Long idMunicipio) {
		return this.repository.findByMunicipioId(idMunicipio);
	}

}
