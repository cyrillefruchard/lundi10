package fr.solutec.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Utilisateur;

public interface UserRepository extends CrudRepository<Utilisateur, Long>{

}
