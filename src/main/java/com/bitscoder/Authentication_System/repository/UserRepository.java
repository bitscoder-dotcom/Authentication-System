package com.bitscoder.Authentication_System.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitscoder.Authentication_System.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    Optional<User> findByEmail(String email);
}
