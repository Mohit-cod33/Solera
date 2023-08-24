package com.solera.userlogin.repository;

import org.springframework.data.repository.CrudRepository;

import com.solera.userlogin.entities.UserData;

public interface UserRepository extends CrudRepository<UserData, Integer> {

}
