package com.notes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notes.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
