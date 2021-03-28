package br.com.bomdestino.sgm.users.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bomdestino.sgm.users.exceptions.NotFoundException;
import br.com.bomdestino.sgm.users.models.User;
import br.com.bomdestino.sgm.users.repositorys.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository repository;
	
	@Autowired
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public User findUserByEmail(String email) {
		try {
			User user = this.repository.findByEmail(email);
			
			if(user == null) {
				throw new NotFoundException("Usuário não encontrado: " + email);
			}
			
			return user;
			
		} catch (Exception e) {
			throw new NotFoundException(e.getMessage(), e.getCause());
		}
	}

}
