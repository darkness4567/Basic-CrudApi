package com.crudApi.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.crudApi.model.User;



public interface UserRepository extends JpaRepository<User,Long> {

	
}