package com.giullianogazzoni.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giullianogazzoni.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
