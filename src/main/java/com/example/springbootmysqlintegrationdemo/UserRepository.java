package com.example.springbootmysqlintegrationdemo;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootmysqlintegrationdemo.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
