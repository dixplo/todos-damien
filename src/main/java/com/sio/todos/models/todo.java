package com.sio.todos.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/* for JPA */
@Entity
public class todo {
	@Id
	private int id;
	private String label;
	private String description;
	private float avancement;
	private int poids;
		

	
	
	/* GETTERS AND SETTERS */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getAvancement() {
		return avancement;
	}
	public void setAvancement(float avancement) {
		this.avancement = avancement;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	
}
