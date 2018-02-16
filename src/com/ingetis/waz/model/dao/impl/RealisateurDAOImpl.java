package com.ingetis.waz.model.dao.impl;

import java.util.List;

import org.hibernate.Session;
import com.ingetis.waz.model.Realisateur;

import com.ingetis.waz.model.dao.RealisateurDAO;

public class RealisateurDAOImpl implements RealisateurDAO {

	@Override
	public void ajouterRealisateur(Realisateur re, Session session) {
		session.beginTransaction();
		session.save(re);
		session.getTransaction().commit();
	}

	@Override
	public void supprimerRealisateur(Long id, Session session) {
		session.beginTransaction();
		Realisateur re = session.find(Realisateur.class, id);
		session.delete(re);
		session.getTransaction().commit();
	}

	@Override
	public void modifierRealisateur(Realisateur re, Session session) {
		session.beginTransaction();
		session.save(re);
		session.getTransaction().commit();
	}

	@Override
	public Realisateur afficherRealisateur(Long id, Session session) {
		return session.find(Realisateur.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Realisateur> afficherRealisateur(Session session){
		return session.createQuery("select c from Realisateur c").getResultList();
	}
	
}
