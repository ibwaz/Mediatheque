package com.ingetis.waz.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("REALISATEUR")
public class Realisateur extends Personne {

	public Realisateur(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public Realisateur() {

	}
	
	@Override
	public String toString() {
		return "Realisateur [nom=" + nom + ", prenom=" + prenom + "]";
	}
}
