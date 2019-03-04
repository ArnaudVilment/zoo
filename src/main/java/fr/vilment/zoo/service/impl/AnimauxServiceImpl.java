package fr.vilment.zoo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.vilment.zoo.domain.Animaux;
import fr.vilment.zoo.repository.AnimauxRepository;
import fr.vilment.zoo.service.IAnimauxService;

@Service
public class AnimauxServiceImpl implements IAnimauxService {

	@Autowired
	private AnimauxRepository animauxRepository;

	@Override
	public List<Animaux> selectAll() {
		// TODO Auto-generated method stub
		return animauxRepository.findAll();
	}

	@Override
	public Animaux selectOn(int id) {
		// TODO Auto-generated method stub
		return animauxRepository.getOne(id);
	}

	@Override
	public void deleteOne(int id) {
		// TODO Auto-generated method stub
		animauxRepository.deleteById(id);
	}

	@Override
	public void newAnimal(Animaux animal) {
		// TODO Auto-generated method stub
		animauxRepository.save(animal);
	}

	@Override
	public void editAnimal(Animaux animal) {
		// TODO Auto-generated method stub
		animauxRepository.save(animal);
	}
}
