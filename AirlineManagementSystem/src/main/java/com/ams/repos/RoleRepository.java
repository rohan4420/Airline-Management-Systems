package com.ams.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}

