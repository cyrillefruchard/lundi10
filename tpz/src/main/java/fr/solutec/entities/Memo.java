package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Memo {
	@Id @GeneratedValue
	private Long id;
	private String contenu;
	@ManyToOne
	private Utilisateur expediteur;
	@ManyToOne
	private Utilisateur destinataire;
}
