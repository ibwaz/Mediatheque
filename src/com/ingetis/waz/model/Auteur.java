package com.ingetis.waz.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AUTEUR")
public class Auteur extends Personne {
	
	@Column(name = "NBRE_LIVRE")
	private int nbreLivre;
	
	
	public Auteur() {
		super();
	}
	public Auteur(String nom, String prenom, int nbreLivre) {
		super(nom, prenom);
		this.nbreLivre = nbreLivre;
	}
	public int getNbreLivre() {
		return nbreLivre;
	}
	public void setNbreLivre(int nbreLivre) {
		this.nbreLivre = nbreLivre;
	}
	@Override
	public String toString() {
		return "Auteur [nom=" + nom + ", prenom=" + prenom + ", nbreLivre=" + nbreLivre + "]";
	}
	public void addLivre(){
		++this.nbreLivre;
	}
}
