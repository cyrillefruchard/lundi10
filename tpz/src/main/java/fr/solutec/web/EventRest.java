package fr.solutec.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Event;
import fr.solutec.repositories.EventRepository;

@RestController @CrossOrigin("*")
public class EventRest {
	@Autowired
	private EventRepository eventRepo;
	
	@PostMapping
	private Event saveEvent(@RequestBody Event e) {
		return eventRepo.save(e);
	}
}
