package com.ingetis.waz.model.dao;

import java.util.List;

import org.hibernate.Session;


import com.ingetis.waz.model.Adresse;

public interface AdresseDAO {
	public void ajouterAdresse(Adresse adr, Session session);
	public void supprimerAdresse(Long id, Session session);
	public void modifierAdresse(Adresse adr, Session session);
	public Adresse afficherAdresse(Long id, Session session);
	public List<Adresse> afficherAdresse(Session session);
}
