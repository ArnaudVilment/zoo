package fr.vilment.zoo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "gardiens") 
public class Gardiens {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "age")
	private int age;
	@Column(name = "numero")
	private int numero;
	
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
	public String getPrenom() {
		return prenom;
	}
	public void setPreom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
