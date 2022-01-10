package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Utilisateur {

	@Id
	@GeneratedValue

	private long id;
	private String prenom;
	private String nom;
	private String login;
	private String mdp;

}
