package com.sio.todos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sio.todos.models.todo;

public interface TodoRepository extends JpaRepository<todo, Integer> {

}
