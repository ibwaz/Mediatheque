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

public interface IFactory {
	public Livre createLivre(String titre, String editeur, List<Auteur> auteurs);
	public LivreInfo createLivreInfo(String titre, String editeur, List<Auteur> auteurs, int nbreCDROM);
	public CD createCD(String titre, Personne realisateurProducteur, List<Personne> acteursChanteurs) throws Exception;
	public DVD createDVD(String titre, Personne realisateurProducteur, List<Personne> acteursChanteurs) throws Exception;
	
	public Adresse createAdresse(int numRue, String nomRue, String codePostal, String ville);
	public Adherent createAdherent(String nom, String prenom, Adresse adresse);
	public Auteur createAuteur(String nom, String prenom, Adresse adresse, int nbreLivre);
	
	public Acteur createActeur(String nom, String prenom);
	public Producteur createProducteur(String nom, String prenom);
	public Realisateur createRealisateur(String nom, String prenom);
	
	public void updateAuteurs(List<Auteur> auteurs);
	
	
	
	
}
