package com.ingetis.waz.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PRODUCTEUR")
public class Producteur extends Personne{

	public Producteur(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public Producteur() {

	}
	
	@Override
	public String toString() {
		return "Producteur [nom=" + nom + ", prenom=" + prenom + "]";
	}
}
