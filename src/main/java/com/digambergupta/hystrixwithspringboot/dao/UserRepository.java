package com.digambergupta.hystrixwithspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digambergupta.hystrixwithspringboot.entity.User;

/**
 * @author Digamber Gupta
 * Interface used for Crud operation using {@link JpaRepository}
 * @since 1.0-SNAPSHOT
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
