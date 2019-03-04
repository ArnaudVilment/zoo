package fr.vilment.zoo.service;

import java.util.List;

import fr.vilment.zoo.domain.Gardiens;

public interface IGardiensService {

	public List<Gardiens> selectAll();
	public Gardiens selectOn(int id);
	public void deleteOne(int id);
	public void newGardien(Gardiens gardien);
	public void editGardien(Gardiens gardien);
}
