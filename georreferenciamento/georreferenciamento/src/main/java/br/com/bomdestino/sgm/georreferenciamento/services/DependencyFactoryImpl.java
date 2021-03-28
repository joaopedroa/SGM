package br.com.bomdestino.sgm.georreferenciamento.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DependencyFactoryImpl implements DependencyFactory {
	
	@Value("${api.ibge.url}")
	private String urlIbge;

	@Override
	public String getUrlIBGE() {
		return this.urlIbge;
	}

}
