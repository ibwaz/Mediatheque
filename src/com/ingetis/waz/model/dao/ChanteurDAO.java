package com.ingetis.waz.model.dao;

import java.util.List;

import org.hibernate.Session;

import com.ingetis.waz.model.Chanteur;


public interface ChanteurDAO {
	public void ajouterChanteur(Chanteur c, Session session);
	public void supprimerChanteur(Long id, Session session);
	public void modifierChanteur(Chanteur c, Session session);
	public Chanteur afficherChanteur(Long id, Session session);
	public List<Chanteur> afficherChanteur(Session session);
}
