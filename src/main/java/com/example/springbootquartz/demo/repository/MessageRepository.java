package com.example.springbootquartz.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootquartz.demo.model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {

}
