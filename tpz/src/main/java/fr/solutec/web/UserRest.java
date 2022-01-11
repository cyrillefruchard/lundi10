package fr.solutec.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Utilisateur;
import fr.solutec.repositories.UserRepository;

@RestController
@CrossOrigin("*")
public class UserRest {
	@Autowired
	private UserRepository userRepo;

	@GetMapping("user")
	public Iterable<Utilisateur> getAllPersons() {
		return userRepo.findAll();
	}

	@PostMapping("user/login")
	public List<Utilisateur> savePerson(@RequestBody Utilisateur p) {
		return userRepo.findByLoginAndPassword(p.getLogin(), p.getMdp());
	}

}
