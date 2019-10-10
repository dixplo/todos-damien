package com.sio.todos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sio.todos.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
