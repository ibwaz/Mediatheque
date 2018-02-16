package com.ingetis.waz.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CD")
public class CD extends CDOuDVD {
	
	public CD(String titre) {
		super(titre);
	}
	
	public CD() {

	}
	
	public CD(String titre, Personne realisateurProducteur, List<Personne> acteursChanteurs) throws Exception {
		super(titre, realisateurProducteur, acteursChanteurs);
	}
	@Override
	public String toString() {
		return "CD [code=" + code + ", titre=" + titre + ", disponible=" + disponible + "]";
	}
}
