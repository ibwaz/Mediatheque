package com.ingetis.waz.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CHANTEUR")
public class Chanteur extends Personne {

	public Chanteur(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public Chanteur() {

	}
	
	@Override
	public String toString() {
		return "Chanteur [nom=" + nom + ", prenom=" + prenom + "]";
	}
}
