package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Memo;
import fr.solutec.entities.Utilisateur;
import fr.solutec.repositories.MemoRepository;
import fr.solutec.repositories.UserRepository;

@SpringBootApplication
public class TpApplication implements CommandLineRunner {
	@Autowired
	private MemoRepository memoRepos;
	@Autowired
	private UserRepository utilisateurRepos;

	public static void main(String[] args) {
		SpringApplication.run(TpApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("lancement des applications perso");

		Utilisateur u1 = new Utilisateur(null, "Marc", "Dupondt", "Marco", "azertyuiop");
		Utilisateur u2 = new Utilisateur(null, "James", "Dupondt", "Thor", "aa");

		Memo m1 = new Memo(null, "Salut ça va", u1, u2);
		Memo m2 = new Memo(null, "ok nickel", u2, u1);

	}

}
