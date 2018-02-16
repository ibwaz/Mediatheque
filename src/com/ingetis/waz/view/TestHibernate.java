package com.ingetis.waz.view;

import java.util.ArrayList;
import java.util.List;

import com.ingetis.waz.model.Acteur;
import com.ingetis.waz.model.Adherent;
import com.ingetis.waz.model.Adresse;
import com.ingetis.waz.model.Auteur;
import com.ingetis.waz.model.CD;
import com.ingetis.waz.model.Chanteur;
import com.ingetis.waz.model.DVD;
import com.ingetis.waz.model.Livre;
import com.ingetis.waz.model.LivreInfo;
import com.ingetis.waz.model.Producteur;
import com.ingetis.waz.model.Realisateur;
import com.ingetis.waz.service.HibernateGestion;

public class TestHibernate {

	public static void main(String[] args) {
		HibernateGestion.getHibernateSassion();
		
		
		//AJOUTER CHANTEUR
		HibernateGestion.daoChanteur.ajouterChanteur(new Chanteur("waz1", "ibhwaz1"), HibernateGestion.session);
		HibernateGestion.daoChanteur.ajouterChanteur(new Chanteur("waz2", "ibhwaz2"), HibernateGestion.session);
		HibernateGestion.daoChanteur.ajouterChanteur(new Chanteur("waz3", "ibhwaz3"), HibernateGestion.session);
		
		//AFFICHER CHANTEUR
		//Chanteur a = HibernateGestion.daoChanteur.afficherChanteur(3L, HibernateGestion.session);
		List<Chanteur> chanteurs = HibernateGestion.daoChanteur.afficherChanteur(HibernateGestion.session);
		for(int i=0; i<chanteurs.size(); ++i) {
			System.out.println(chanteurs.get(i));
		}  
		
		//SUPPRIMER CHANTEUR
		HibernateGestion.daoChanteur.supprimerChanteur(chanteurs.get(0).getId(), HibernateGestion.session);
		
	    //MODIFIER CHANTEUR
		chanteurs.get(0).setPrenom("DRA");
		HibernateGestion.daoChanteur.modifierChanteur(chanteurs.get(0), HibernateGestion.session);    
		
		
		
		
		
		//AJOUTER PRODUCTEUR
		 HibernateGestion.daoProducteur.ajouterProducteur(new Producteur("waz1","ibhwaz1"), HibernateGestion.session);
		  HibernateGestion.daoProducteur.ajouterProducteur(new Producteur("waz2","ibhwaz2"), HibernateGestion.session);
		   HibernateGestion.daoProducteur.ajouterProducteur(new Producteur("waz3","ibhwaz3"), HibernateGestion.session);
		 
		
		//AFFICHER PRODUCTEUR
		//Producteur a = HibernateGestion.daoProducteur.afficherProducteur(7L, HibernateGestion.session);
		List<Producteur> Producteurs = HibernateGestion.daoProducteur.afficherProducteur(HibernateGestion.session);
		for(int i=0; i<Producteurs.size(); ++i) {
			System.out.println(Producteurs.get(i));
		}
		
		//SUPPRIMER PRODUCTEUR   
		HibernateGestion.daoProducteur.supprimerProducteur(Producteurs.get(0).getId(), HibernateGestion.session);
		
		//MODIFIER PRODUCTEUR
		Producteurs.get(0).setPrenom("DRA");
		HibernateGestion.daoProducteur.modifierProducteur(Producteurs.get(0), HibernateGestion.session);
		
		
		
		
		
		
		
		
		//AJOUTER ADHERENT
		HibernateGestion.daoAdherent.ajouterAdherent(new Adherent("wazi1", "ibwaz1"), HibernateGestion.session);
		HibernateGestion.daoAdherent.ajouterAdherent(new Adherent("wazi2", "ibwaz2"), HibernateGestion.session);
		HibernateGestion.daoAdherent.ajouterAdherent(new Adherent("wazi3", "ibwaz3"), HibernateGestion.session);
		
		
	//	AFFICHER ADHERENT
		//Adherent a = HibernateGestion.daoAdherent.afficherAdherent(7L, HibernateGestion.session);
		List<Adherent> Adherents = HibernateGestion.daoAdherent.afficherAdherent(HibernateGestion.session);
		for(int i=0; i<Adherents.size(); ++i) {
			System.out.println(Adherents.get(i));
		}
		
		//SUPPRIMER ADHERENT      
		HibernateGestion.daoAdherent.supprimerAdherent(Adherents.get(0).getId(), HibernateGestion.session);  
		
		//MODIFIER ADHERENT
		Adherents.get(0).setPrenom("DRA");
		HibernateGestion.daoAdherent.modifierAdherent(Adherents.get(0), HibernateGestion.session);
		
		
		
		
		
		//AJOUTER REALISATEUR
		HibernateGestion.daoRealisateur.ajouterRealisateur(new Realisateur("zzzz1", "iiiii1"), HibernateGestion.session);  
		HibernateGestion.daoRealisateur.ajouterRealisateur(new Realisateur("zzzz2", "iiiii2"), HibernateGestion.session);  
		HibernateGestion.daoRealisateur.ajouterRealisateur(new Realisateur("zzzz3", "iiiii3"), HibernateGestion.session);  
		
		
		//AFFICHER REALISATEUR
		//Realisateur a = HibernateGestion.daoRealisateur.afficherRealisateur(7L, HibernateGestion.session);
		List<Realisateur> Realisateurs = HibernateGestion.daoRealisateur.afficherRealisateur(HibernateGestion.session);
		for(int i=0; i<Realisateurs.size(); ++i) {
			System.out.println(Realisateurs.get(i));
		}
		
		//SUPPRIMER REALISATEUR     
		HibernateGestion.daoRealisateur.supprimerRealisateur(Realisateurs.get(0).getId(), HibernateGestion.session);
		
		//MODIFIER REALISATEUR
		Realisateurs.get(0).setPrenom("DRA");
		HibernateGestion.daoRealisateur.modifierRealisateur(Realisateurs.get(0), HibernateGestion.session); 
		
		
		
		
		
		
		
		//AJOUTER AUTEUR
		HibernateGestion.daoAuteur.ajouterAuteur(new Auteur("DIARRA1", "Abdoulaye1", 3), HibernateGestion.session);
		HibernateGestion.daoAuteur.ajouterAuteur(new Auteur("DIARRA2", "Abdoulaye2", 5), HibernateGestion.session);
		HibernateGestion.daoAuteur.ajouterAuteur(new Auteur("DIARRA3", "Abdoulaye3", 2), HibernateGestion.session);
		
		
		
		//AFFICHER AUTEUR
	//	Auteur a = HibernateGestion.daoAuteur.afficherAuteur(2L, HibernateGestion.session);
		List<Auteur> Auteurs = HibernateGestion.daoAuteur.afficherAuteur(HibernateGestion.session);
		for(int i=0; i<Auteurs.size(); ++i) {
			System.out.println(Auteurs.get(i));
		}
		
		//SUPPRIMER AUTEUR
        HibernateGestion.daoAuteur.supprimerAuteur(Auteurs.get(0).getId(), HibernateGestion.session);
		
		//MODIFIER AUTEUR
		Auteurs.get(0).setPrenom("WAZ");
		HibernateGestion.daoAuteur.modifierAuteur(Auteurs.get(0), HibernateGestion.session);   
		
		
		
		
		
		
		//AJOUTER ACTEUR
		 HibernateGestion.daoActeur.ajouterActeur(new Acteur("Gadjaga1", "papus1"), HibernateGestion.session);
		  HibernateGestion.daoActeur.ajouterActeur(new Acteur("Gadjaga2", "papus2"), HibernateGestion.session);
		   HibernateGestion.daoActeur.ajouterActeur(new Acteur("Gadjaga3", "papus2"), HibernateGestion.session);
		
		
		
		//AFFICHER ACTEUR
	    List<Acteur> Acteurs = HibernateGestion.daoActeur.afficherActeur(HibernateGestion.session);
		for(int i=0; i<Acteurs.size(); ++i) {
			System.out.println(Acteurs.get(i));
		}
		
		//SUPPRIMER UN ACTEUR
		HibernateGestion.daoActeur.supprimerActeur(Acteurs.get(0).getId(), HibernateGestion.session);	
		
		//MODIFIER ACTEUR
		Acteurs.get(0).setPrenom("DODOD");
		HibernateGestion.daoActeur.modifierActeur(Acteurs.get(0), HibernateGestion.session); 
		
		
		
		
		
		

		
		//AJOUTER ADRESSE
		HibernateGestion.daoAdresse.ajouterAdresse(new Adresse(2,"Square_de_vesoul", "CP_91080", "COURCOURONNES"), HibernateGestion.session);
		HibernateGestion.daoAdresse.ajouterAdresse(new Adresse(21,"Square_de_vesoul", "CP_91080", "COURCOURONNES"), HibernateGestion.session);
		HibernateGestion.daoAdresse.ajouterAdresse(new Adresse(23,"Square_de_vesoul", "CP_91080", "COURCOURONNES"), HibernateGestion.session);
		
		 
		
		//AFFICHER ADRESSE
	   // Adresse a = HibernateGestion.daoAdresse.afficherAdresse(3L, HibernateGestion.session);
		List<Adresse> Adresses = HibernateGestion.daoAdresse.afficherAdresse(HibernateGestion.session);
		for(int i=0; i<Adresses.size(); ++i) {
			System.out.println(Adresses.get(i));
		}
		
		//SUPPRIMER ADRESSE  
		HibernateGestion.daoAdresse.supprimerAdresse(Adresses.get(0).getId(), HibernateGestion.session); 
		
		//MODIFIER ADRESSE
		Adresses.get(0).setNomRue("DODOD");
		HibernateGestion.daoAdresse.modifierAdresse(Adresses.get(0), HibernateGestion.session);   
		
		
		
		
		
		//AJOUTER DVD
		HibernateGestion.daoDVD.ajouterDVD(new DVD("wazidvd1"), HibernateGestion.session);
		HibernateGestion.daoDVD.ajouterDVD(new DVD("wazidvd2"), HibernateGestion.session);
		HibernateGestion.daoDVD.ajouterDVD(new DVD("wazidvd3"), HibernateGestion.session);
		
		
		
		//AFFICHER DVD
		List<DVD> dvds = HibernateGestion.daoDVD.afficherDVD(HibernateGestion.session);
		for(int i=0; i<dvds.size(); ++i) {
			System.out.println(dvds.get(i));
		}
		
		//SUPPRIMER DVD
		HibernateGestion.daoDVD.supprimerDVD(dvds.get(0).getId(), HibernateGestion.session);  
		
		
		//AJOUTER CD
		HibernateGestion.daoCD.ajouterCD(new CD("wazidvd1111"), HibernateGestion.session);
		HibernateGestion.daoCD.ajouterCD(new CD("wazidvd222222"), HibernateGestion.session);
		HibernateGestion.daoCD.ajouterCD(new CD("wazidvd333333"), HibernateGestion.session);
		
		
		
		//AFFICHER CD
		List<CD> CDs = HibernateGestion.daoCD.afficherCD(HibernateGestion.session);
		for(int i=0; i<CDs.size(); ++i) {
			System.out.println(CDs.get(i));
		}
		
		//SUPPRIMER CD
		HibernateGestion.daoCD.supprimerCD(CDs.get(0).getId(), HibernateGestion.session);  
		
		
		
		//AJOUTER LIVRE
		HibernateGestion.daoLivre.ajouterLivre(new Livre("wazidvd5555", "frfrfrf55555"), HibernateGestion.session);
		HibernateGestion.daoLivre.ajouterLivre(new Livre("wazidvd44848", "frfrfrf44848"), HibernateGestion.session);
		HibernateGestion.daoLivre.ajouterLivre(new Livre("wazidvd58789", "frfrfrf449875"), HibernateGestion.session);
		
 
		
		List<Livre> Livres = HibernateGestion.daoLivre.afficherLivre(HibernateGestion.session);
		for(int i=0; i<Livres.size(); ++i) {
			System.out.println(Livres.get(i));
		} 
		 
		
		//SUPPRIMER LIVRE   
		HibernateGestion.daoLivre.supprimerLivre(Livres.get(0).getId(), HibernateGestion.session); 
		
		//AJOUTER LIVREINFO
		
		Auteur auteur = HibernateGestion.daoAuteur.afficherAuteur(1L, HibernateGestion.session);
		List<Auteur> auteurs = new ArrayList<>();
		auteurs.add(auteur);
		HibernateGestion.daoLivreInfo.ajouterLivreInfo(new LivreInfo("wazidvd11", "frfrfrf11", auteurs, 5), HibernateGestion.session);
		HibernateGestion.daoLivreInfo.ajouterLivreInfo(new LivreInfo("wazidvd12", "frfrfrf12", auteurs, 1), HibernateGestion.session);
		HibernateGestion.daoLivreInfo.ajouterLivreInfo(new LivreInfo("wazidvd13", "frfrfrf13", auteurs, 3), HibernateGestion.session);
		
		
		//AFFICHER LivreInfo
		List<LivreInfo> LivreInfos = HibernateGestion.daoLivreInfo.afficherLivreInfo(HibernateGestion.session);
		for(int i=0; i<LivreInfos.size(); ++i) {
			System.out.println(LivreInfos.get(i));
		} 
		
		//SUPPRIMER LivreInfo   
		HibernateGestion.daoLivre.supprimerLivre(LivreInfos.get(0).getId(), HibernateGestion.session); 
				

       
		
	
		
		
		
		
		
		
		
		
		HibernateGestion.closeHibernateSassion();
	}

}
