package com.ingetis.waz.model.dao;

import java.util.List;

import org.hibernate.Session;
import com.ingetis.waz.model.Realisateur;

public interface RealisateurDAO {
	public void ajouterRealisateur(Realisateur re, Session session);
	public void supprimerRealisateur(Long id, Session session);
	public void modifierRealisateur(Realisateur re, Session session);
	public Realisateur afficherRealisateur(Long id, Session session);
	public List<Realisateur> afficherRealisateur(Session session);
}
