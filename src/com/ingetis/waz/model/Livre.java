package com.ingetis.waz.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("LIVRE")
public class Livre extends Produit {
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "LIVRE_AUTEUR", 
        joinColumns = { @JoinColumn(name = "ID_PRODUIT") }, 
        inverseJoinColumns = { @JoinColumn(name = "ID_AUTEUR") }
    )
	protected List<Auteur> auteurs; // 1 <= auteurs.size <= 3
	@Column(name="EDITEUR")
	protected String editeur;
	
	public Livre(String titre, String editeur) {
		super(titre);
		this.editeur = editeur;
		this.auteurs = new ArrayList<>();
	}
	
	public Livre(String titre, String editeur, List<Auteur> auteurs) {
		super(titre);
		this.editeur = editeur;
		this.auteurs = auteurs;
	}
	
	public Livre() {

	}
	
	
	public void addAuteur(List<Auteur> auts) throws Exception {
		switch (auts.size()){
		case 1 : case 3 :
			for(int i=0; i<auts.size();++i){
				auteurs.add(auts.get(i));
			}
			break;
		default :
			throw new Exception("Le nombre d'auteurs doit être compris entre 1 et 3");
		}
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public List<Auteur> getAuteurs() {
		return auteurs;
	}
	public void setAuteurs(List<Auteur> auteurs) {
		this.auteurs = auteurs;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	
	@Override
	public String toString() {
		return "Livre [code=" + code + ", titre=" + titre + ", disponible=" + disponible + ", auteurs=" + auteurs
				+ ", editeur=" + editeur + "]";
	}
	
}
