package com.ingetis.waz.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("CD_OU_DVD")
public abstract class CDOuDVD extends Produit {	

	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "CD_OU_DVD_AUTEUR_CHANTEUR", 
        joinColumns = { @JoinColumn(name = "ID_PRODUIT") }, 
        inverseJoinColumns = { @JoinColumn(name = "ID_AUTEUR_OU_CHANTEUR") }
    )
	private List<Personne> acteursChanteurs;
	@ManyToOne
	@JoinColumn(name="REALISATEUR_PRODUCTEUR")
	private Personne realisateurProducteur;
	
	public CDOuDVD(String titre) {
		super(titre);
		this.acteursChanteurs = new ArrayList<>();
	}
	
	public CDOuDVD() {

	}
	
	
	public CDOuDVD(String titre, Personne realisateurProducteur, List<Personne> acteursChanteurs) throws Exception {
		super(titre);
		this.realisateurProducteur = realisateurProducteur;
		this.acteursChanteurs = new ArrayList<>();
		addActeursOuChanteurs(acteursChanteurs);
	}
	public void addActeursOuChanteurs(List<Personne> personnes) throws Exception {
		switch (personnes.size()){
		case 2 : case 3 :
			for(int i=0; i<personnes.size();++i){
				acteursChanteurs.add(personnes.get(i));
			}
			break;
		default :
			throw new Exception("Le nombre max d'acteurs et/ou de chanteurs est 3");
		}
	}
	public List<Personne> getActeursChanteurs() {
		return acteursChanteurs;
	}
	public void setActeursChanteurs(List<Personne> acteursChanteurs) {
		this.acteursChanteurs = acteursChanteurs;
	}
	public Personne getRealisateurProducteur() {
		return realisateurProducteur;
	}
	public void setRealisateurProducteur(Personne realisateurProducteur) {
		this.realisateurProducteur = realisateurProducteur;
	}
}
