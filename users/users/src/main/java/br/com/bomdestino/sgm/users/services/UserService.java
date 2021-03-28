package br.com.bomdestino.sgm.users.services;

import br.com.bomdestino.sgm.users.models.User;

public interface UserService {
	
	User findUserByEmail(String email);

}
