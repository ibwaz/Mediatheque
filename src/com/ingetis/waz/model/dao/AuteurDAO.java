package com.ingetis.waz.model.dao;

import java.util.List;

import org.hibernate.Session;


import com.ingetis.waz.model.Auteur;

public interface AuteurDAO {
	public void ajouterAuteur(Auteur au, Session session);
	public void supprimerAuteur(Long id, Session session);
	public void modifierAuteur(Auteur au, Session session);
	public Auteur afficherAuteur(Long id, Session session);
	public List<Auteur> afficherAuteur(Session session);
}
