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
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Memo {
	@Id
	@GeneratedValue
	private Long id;
	private Date datecreation;
	private String contenu;
	private boolean perso;
	@ManyToOne
	private Utilisateur expediteur;
	@ManyToOne
	private Utilisateur destinataire;
}
