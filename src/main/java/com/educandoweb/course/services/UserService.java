package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	// Metodo que retorna todos os usuarios dobanco de dados
	public List<User> findAll(){
		return repository.findAll();
	}
	
	// Busca usuario por id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	// salvar no banco de dados um usuario
	public User insert(User obj) {
		return repository.save(obj);
	}

}
