package com.marco.opendevup.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data //@NoArgsConstructor @AllArgsConstructor
public class Specialiste {
	
	public Specialiste(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Specialiste() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id @GeneratedValue
	private Long id;
	private String nom;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
