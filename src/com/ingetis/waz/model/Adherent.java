package com.ingetis.waz.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("ADHERENT")
public class Adherent extends Personne {
	
	@OneToOne
	@JoinColumn(name="ADRESSE")
	private Adresse adresse;
	@OneToMany(mappedBy="adherent")
	private List<Produit> produits;
	
	public Adherent(String nom, String prenom) {
		super(nom, prenom);
		this.produits = new ArrayList<>();
	}
	
	public Adherent() {

	}
	
	public Adherent(String nom, String prenom, Adresse adresse) {
		super(nom, prenom);
		this.adresse = adresse;
		this.produits = new ArrayList<>();
	}
	// aciennement appelé emprunteLivre
	public void emprunteProduit(Produit produit) throws Exception{
		if(this.produits.size() < 5){
			produit.setDisponible(false);
			this.produits.add(produit);
		}
		else{
			throw new Exception("vous avez emprunte 5 produits! (Max : 5)");
		}
	}
	// aciennement appelé rendreLivre
	public void rendreProduit(Produit produit){
		produit.setDisponible(true);
		this.produits.remove(produit);
	}
	// aciennement appelé LivreEmpruntes
	public String produitEmpruntes(){
		String produitsEmp = "";
		for(Produit produit : this.produits){
			if(!produit.isDisponible()){
				produitsEmp += produit.getTitre() + ", ";
			}
		}
		return produitsEmp;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Adherent [nom="
				+ nom + ", prenom=" + prenom + ", adresse=" + adresse + ", produits= [" + produits + "]";
	}
	
}
