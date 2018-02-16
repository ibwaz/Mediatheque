package com.ingetis.waz.model.dao;

import java.util.List;

import org.hibernate.Session;

import com.ingetis.waz.model.Acteur;


public interface ActeurDAO {
	public void ajouterActeur(Acteur a, Session session);
	public void supprimerActeur(Long id, Session session);
	public void modifierActeur(Acteur a, Session session);
	public Acteur afficherActeur(Long id, Session session);
	public List<Acteur> afficherActeur(Session session);
}
