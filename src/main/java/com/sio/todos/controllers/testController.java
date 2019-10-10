package com.sio.todos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.sio.todos.models.Todo;
import com.sio.todos.repositories.TodoRepository;



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
	
	
	
	/* Adding To Do */
	@GetMapping("addToDo")
	public RedirectView addToDo(int Id, String Label, String Description, float Avancement, int poids)
	{
		Todo todos = new Todo();
		todos.setId(Id);
		todos.setLabel(Label);
		todos.setDescription(Description);
		todos.setAvancement(Avancement);
		todos.setPoids(poids);
		TodoRepository.save(todos);
		return new RedirectView("index");
	}

	/* Show To Do List */
	@GetMapping("")
	 public String displayOrganization(ModelMap model) {
		 java.util.List<Todo> todos=TodoRepository.findAll();
		 model.put("Todo", todo);
		 return "index";
	}
	
	
	/* Delete by ID */
	@GetMapping("RemTodo/{{id}}")
	public RedirectView RemOrgas(@PathVariable int id)
	{
		TodoRepository.deleteById(id);
		return new RedirectView("index");
	}
	

	
}