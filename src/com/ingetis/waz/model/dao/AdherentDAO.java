package com.ingetis.waz.model.dao;

import java.util.List;

import org.hibernate.Session;


import com.ingetis.waz.model.Adherent;

public interface AdherentDAO {
	public void ajouterAdherent(Adherent ad, Session session);
	public void supprimerAdherent(Long id, Session session);
	public void modifierAdherent(Adherent ad, Session session);
	public Adherent afficherAdherent(Long id, Session session);
	public List<Adherent> afficherAdherent(Session session);
}
