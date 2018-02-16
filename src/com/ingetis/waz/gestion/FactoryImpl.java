package com.ingetis.waz.gestion;

import java.util.List;

import com.ingetis.waz.model.Acteur;
import com.ingetis.waz.model.Adherent;
import com.ingetis.waz.model.Adresse;
import com.ingetis.waz.model.Auteur;
import com.ingetis.waz.model.CD;
import com.ingetis.waz.model.DVD;
import com.ingetis.waz.model.Livre;
import com.ingetis.waz.model.LivreInfo;
import com.ingetis.waz.model.Personne;
import com.ingetis.waz.model.Producteur;
import com.ingetis.waz.model.Realisateur;


public class FactoryImpl implements IFactory {

	@Override
	public Livre createLivre(String titre, String editeur, List<Auteur> auteurs) {
		Livre livre = new Livre(titre, editeur, auteurs);
		//livre.initCode();
		updateAuteurs(auteurs);
		return livre;
	}

	@Override
	public LivreInfo createLivreInfo(String titre, String editeur, List<Auteur> auteurs, int nbreCDROM) {
		LivreInfo livreInfo = new LivreInfo(titre, editeur, auteurs, nbreCDROM);
		//livreInfo.initCode();
		updateAuteurs(auteurs);
		return livreInfo;
	}

	@Override
	public CD createCD(String titre, Personne realisateurProducteur, List<Personne> acteursChanteurs) throws Exception {
		CD cd = new CD(titre, realisateurProducteur, acteursChanteurs);
		//cd.initCode();
		return cd;
	}

	@Override
	public DVD createDVD(String titre, Personne realisateurProducteur, List<Personne> acteursChanteurs) throws Exception {
		DVD dvd = new DVD(titre, realisateurProducteur, acteursChanteurs);
		//dvd.initCode();
		return dvd;
	}

	@Override
	public Adresse createAdresse(int numRue, String nomRue, String codePostal, String ville) {
		return new Adresse(numRue, nomRue, codePostal, ville);
	}

	@Override
	public Adherent createAdherent(String nom, String prenom, Adresse adresse) {
		return new Adherent(nom, prenom, adresse);
	}

	@Override
	public Auteur createAuteur(String nom, String prenom, Adresse adresse, int nbreLivre) {
		return null; //new Auteur(nom, prenom, adresse, nbreLivre);
	}

	@Override
	public Acteur createActeur(String nom, String prenom) {
		return new Acteur(nom, prenom);
	}

	@Override
	public Producteur createProducteur(String nom, String prenom) {
		return new Producteur(nom, prenom);
	}

	@Override
	public Realisateur createRealisateur(String nom, String prenom) {
		return new Realisateur(nom, prenom);
	}

	@Override
	public void updateAuteurs(List<Auteur> auteurs) {
		for(Auteur auteur : auteurs){
			auteur.addLivre();
		}
	}

}
