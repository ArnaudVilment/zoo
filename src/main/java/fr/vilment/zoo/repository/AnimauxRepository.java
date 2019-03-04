package fr.vilment.zoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.vilment.zoo.domain.Animaux;

@Repository
public interface AnimauxRepository extends JpaRepository<Animaux, Integer> {

}
