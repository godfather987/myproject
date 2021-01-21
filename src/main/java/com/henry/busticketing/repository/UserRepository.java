package com.henry.busticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henry.busticketing.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
 User findByUserNameAndPassword(String un,String psw);
	
}
