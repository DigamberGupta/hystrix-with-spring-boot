package com.digambergupta.hystrixwithspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digambergupta.hystrixwithspringboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
