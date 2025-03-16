package com.luv2code.jobportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.jobportal.entity.UsersType;
import com.luv2code.jobportal.repository.UsersTypeRepository;

@Service
public class UserstypeService {

	@Autowired
	private final UsersTypeRepository usersTypeRepository;

	public UserstypeService(UsersTypeRepository usersTypeRepository) {
		this.usersTypeRepository = usersTypeRepository;
	}

	public List<UsersType> getAll() {
		return usersTypeRepository.findAll();
	}

}
