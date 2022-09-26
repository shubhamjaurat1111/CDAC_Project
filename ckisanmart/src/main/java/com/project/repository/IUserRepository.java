package com.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pojo.User;

public interface IUserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByEmail(String username);
}
