package com.yonquixote.contactManagementApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yonquixote.contactManagementApi.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
