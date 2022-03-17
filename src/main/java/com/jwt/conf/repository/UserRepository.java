package com.jwt.conf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.conf.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
