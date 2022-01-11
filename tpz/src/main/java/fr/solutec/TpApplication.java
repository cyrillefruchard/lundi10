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
		
		utilisateurRepos.save(u1);
		utilisateurRepos.save(u2);

		Memo m1 = new Memo(null, "Salut ça va", false, u1, u2);
		Memo m2 = new Memo(null, "ok nickel", false, u2, u1);
		Memo m3 = new Memo(null, "Ceci est un mémo public", false, u2, null);
		Memo m4 = new Memo(null, "Là aussi", false, u2, null);
		Memo m5 = new Memo(null, "Mémo personel", true, u2, null);
		
		memoRepos.save(m1);
		memoRepos.save(m2);
		memoRepos.save(m3);
		memoRepos.save(m4);
		memoRepos.save(m5);

	}

}
