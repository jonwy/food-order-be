package com.padepokan79.foodorder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.padepokan79.foodorder.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
}
