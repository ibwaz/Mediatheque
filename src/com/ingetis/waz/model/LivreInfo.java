package com.ingetis.waz.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("LIVRE_INFO")
public class LivreInfo extends Livre{
	
	protected int nbreCDROM;
	
	public LivreInfo() {
		
	}
	public LivreInfo(String titre, String editeur, List<Auteur> auteurs, int nbreCDROM) {
		super(titre, editeur, auteurs);
		this.nbreCDROM = nbreCDROM;
	}
	@Override
	public void addAuteur(List<Auteur> auts) throws Exception {
		switch (auts.size()){
		case 1 : case 2 :
			for(int i=0; i<auts.size();++i){
				auteurs.add(auts.get(i));
			}
			break;
		default :
			throw new Exception("Le nombre d'auteurs doit être compris entre 1 et 2");
		}
	}
	public int getNbreCDROM() {
		return nbreCDROM;
	}
	public void setNbreCDROM(int nbreCDROM) {
		this.nbreCDROM = nbreCDROM;
	}
	@Override
	public String toString() {
		return "LivreInfo [code=" + code + ", titre=" + titre + ", disponible=" + disponible + ", nbreCDROM=" + nbreCDROM + ", editeur=" + editeur
				+ ", auteurs= [" + auteurs + "] ]";
	}
}
