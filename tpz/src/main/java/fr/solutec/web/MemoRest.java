package fr.solutec.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Memo;
import fr.solutec.entities.Utilisateur;
import fr.solutec.repositories.MemoRepository;
import fr.solutec.repositories.UserRepository;

@RestController @CrossOrigin("*")
public class MemoRest {
	@Autowired
	private MemoRepository memoRepo;
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/memo/expediteur/{id}")
	public Iterable<Memo> getMemoUser(@PathVariable Long id){
		Optional<Utilisateur> expediteur = userRepo.findById(id);
		return memoRepo.findByExpediteur(expediteur);
	}
	
	@GetMapping("memo")
	public Iterable<Memo> getAllMemo(){
		return memoRepo.findAll();
	}
}
