package com.ingetis.waz.view;

import java.util.ArrayList;
import java.util.List;

import com.ingetis.waz.gestion.FactoryImpl;
import com.ingetis.waz.gestion.IFactory;
import com.ingetis.waz.model.Adresse;
import com.ingetis.waz.model.Auteur;
import com.ingetis.waz.model.Personne;
import com.ingetis.waz.model.Produit;

public class Mediatheque {

	public static void main(String[] args) {
		
		// Declaration variables générales
		IFactory myFactory = new FactoryImpl();
		List<Personne> personnes = new ArrayList<>();
		List<Produit> produits = new ArrayList<>();
		
		// Creation d'adresses
		Adresse adresse1 = myFactory.createAdresse(1, "rue d'Aquitaine", "91130", "Ris-Orangis");
		Adresse adresse2 = myFactory.createAdresse(16, "rue du Stand", "90400", "Danjoutin");
		Adresse adresse3 = myFactory.createAdresse(128, "allée des Champs Elysées", "91042", "Evry");
		Adresse adresse4 = myFactory.createAdresse(12, "rue du Stand", "90400", "Danjoutin");
		
		// Creation d'auteurs
		Personne auteur1 = myFactory.createAuteur("med", "Aly", adresse1, 0);
		Personne auteur2 = myFactory.createAuteur("Simon", "Edouard", adresse2, 0);
		Personne auteur3 = myFactory.createAuteur("Mendez", "Zedmen", adresse3, 0);
		Personne auteur4 = myFactory.createAuteur("who", "I am", adresse4, 0);
		
		// Ajout des auteurs à la liste personnes
		personnes.add(auteur1);
		personnes.add(auteur2);
		personnes.add(auteur3);
		personnes.add(auteur4);
		
		// Variables particuliaires pour le test
		List<Auteur> auteurs1 = new ArrayList<>();
		auteurs1.add((Auteur) auteur1);
		auteurs1.add((Auteur) auteur3);
		List<Auteur> auteurs2 = new ArrayList<>();
		auteurs2.add((Auteur) auteur1);
		auteurs2.add((Auteur) auteur4);
		List<Auteur> auteurs3 = new ArrayList<>();
		auteurs3.add((Auteur) auteur2);
		auteurs3.add((Auteur) auteur3);
		auteurs3.add((Auteur) auteur4);		
		
		// Creation de produits
		Produit livre1 = myFactory.createLivre("Java Programing OO", "Magic Paper", auteurs1);
		Produit livre2 = myFactory.createLivre("Programing OO basics", "Printer", auteurs2);
		
		Produit livre3 = myFactory.createLivreInfo("Neural Network", "PrintMax", auteurs3, 2);
		Produit livre4 = myFactory.createLivreInfo("Deep Learning", "GreatPrint", auteurs2, 2);
		
		//CD cd1 = myFactory.createCD(titre, realisateurProducteur, acteursChanteurs)
		
		// Ajout des livres à la liste produits
		produits.add(livre1);
		produits.add(livre2);
		produits.add(livre3);
		produits.add(livre4);
		
		
		
		
		// Affichage
		for(Personne p : personnes){
			System.out.println(p);
		}
		System.out.println("*******************");
		for(Produit p : produits){
			System.out.println(p);
		}
	}

}
