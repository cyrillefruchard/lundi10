package fr.solutec.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Event {
	@Id @GeneratedValue
	private Long id;
	private String titre;
	private String description;
	private Date date;
	@ManyToOne
	private Utilisateur organisateur;
	
}
