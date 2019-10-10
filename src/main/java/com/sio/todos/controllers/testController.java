package com.sio.todos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.sio.todos.models.todo;


@Controller
public class testController {
	
	/* testing controller */
	@RequestMapping("/")
	public String index() {
	return "index";
	}
	
	
	@RequestMapping("/todos")
	public String indexTodos() {
	return "index";
	}
	
	@GetMapping("addToDo")
	public RedirectView addToDo(int Id, String Label, String Description, float Avancement, int poids)
	{
		todo todos = new todo();
		todos.setId(Id);
		todos.setLabel(Label);
		todos.setDescription(Description);
		todos.setAvancement(Avancement);
		todos.setPoids(poids);
		return new RedirectView("index");
	}
	
	
	
}