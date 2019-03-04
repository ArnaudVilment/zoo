package fr.vilment.zoo.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;


@Entity
@Table(name = "animaux") 
public class Animaux {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "race")
	private String race;
	@Column(name = "age")
	private int age;
	@Column(name = "esperence")
	private int esperence;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEsperence() {
		return esperence;
	}
	public void setEsperence(int esperence) {
		this.esperence = esperence;
	}
}
