package fr.solutec.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.repositories.MemoRepository;

@RestController @CrossOrigin("*")
public class MemoRest {
	@Autowired
	private MemoRepository memoRepo;
	
}
