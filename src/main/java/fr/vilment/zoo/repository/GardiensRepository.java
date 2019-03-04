package fr.vilment.zoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.vilment.zoo.domain.Animaux;

@Repository
public interface GardiensRepository extends JpaRepository<Animaux, Integer> {

}
