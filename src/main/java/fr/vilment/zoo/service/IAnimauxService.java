package fr.vilment.zoo.service;

import java.util.List;

import fr.vilment.zoo.domain.Animaux;

public interface IAnimauxService {

	public List<Animaux> selectAll();
	public Animaux selectOn(int id);
	public void deleteOne(int id);
	public void newAnimal(Animaux animal);
	public void editAnimal(Animaux animal);
}
