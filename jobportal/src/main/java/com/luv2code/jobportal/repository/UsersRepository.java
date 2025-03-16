package com.luv2code.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.jobportal.entity.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByEmail(String email);
}
