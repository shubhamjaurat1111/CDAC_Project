package com.project.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.project.repository.IUserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class TestUserRepository {
	@Autowired
	private IUserRepository userRepo;

	@Test
	void testFindByEmail() {
		System.out.println(
				userRepo.findByEmail("prateek@gmail.com").orElseThrow(() -> new RuntimeException("invalid user email")));
	}

}
