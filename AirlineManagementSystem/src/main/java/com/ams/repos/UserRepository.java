package com.ams.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
