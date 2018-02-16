package com.ingetis.waz.model.dao;

import java.util.List;

import org.hibernate.Session;
import com.ingetis.waz.model.Producteur;

public interface ProducteurDAO {
	public void ajouterProducteur(Producteur p, Session session);
	public void supprimerProducteur(Long id, Session session);
	public void modifierProducteur(Producteur p, Session session);
	public Producteur afficherProducteur(Long id, Session session);
	public List<Producteur> afficherProducteur(Session session);
}
