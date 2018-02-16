package com.ingetis.waz.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DVD")
public class DVD extends CDOuDVD{
	
	public DVD(String titre) {
		super(titre);
	}
	
	public DVD() {

	}
	
	
	public DVD(String titre, Personne realisateurProducteur, List<Personne> acteursChanteurs) throws Exception {
		super(titre, realisateurProducteur, acteursChanteurs);
	}
	@Override
	public String toString() {
		return "DVD [code=" + code + ", titre=" + titre + ", disponible=" + disponible + "]";
	}
}
