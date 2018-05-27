package com.fubonlife.bio.repository.jpa;

import org.springframework.data.repository.CrudRepository;

import com.fubonlife.bio.entity.jpa.User;


public interface UserRepository extends CrudRepository<User, String>{

}
