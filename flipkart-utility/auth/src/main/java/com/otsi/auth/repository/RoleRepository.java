package com.otsi.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otsi.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}