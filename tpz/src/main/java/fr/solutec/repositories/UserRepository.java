package fr.solutec.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Utilisateur;

public interface UserRepository extends CrudRepository<Utilisateur, Long> {
	@Query(value = "SELECT u FROM Utilisateur u WHERE u.login = ?1 AND u.mdp= ?2")
	public List<Utilisateur> findByLoginAndPassword(String login, String mdp);

}
