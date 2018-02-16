package com.ingetis.waz.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ACTEUR")
public class Acteur extends Personne {

	public Acteur(String nom, String prenom) {
		super(nom, prenom);
	}

	public Acteur() {

	}

	@Override
	public String toString() {
		return "Acteur [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}
