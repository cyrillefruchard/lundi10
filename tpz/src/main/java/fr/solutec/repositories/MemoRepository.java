package fr.solutec.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Memo;
import fr.solutec.entities.Utilisateur;

public interface MemoRepository extends CrudRepository<Memo, Long>{
	public List<Memo> findByExpediteur(Optional<Utilisateur> expediteur);

}
