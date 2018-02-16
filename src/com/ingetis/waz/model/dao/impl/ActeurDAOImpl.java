package com.ingetis.waz.model.dao.impl;

import java.util.List;

import org.hibernate.Session;
import com.ingetis.waz.model.Acteur;

import com.ingetis.waz.model.dao.ActeurDAO;

public class ActeurDAOImpl implements ActeurDAO {

	@Override
	public void ajouterActeur(Acteur a, Session session) {
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
	}

	@Override
	public void supprimerActeur(Long id, Session session) {
		session.beginTransaction();
		Acteur a = session.find(Acteur.class, id);
		session.delete(a);
		session.getTransaction().commit();
	}

	@Override
	public void modifierActeur(Acteur a, Session session) {
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
	}

	@Override
	public Acteur afficherActeur(Long id, Session session) {
		return session.find(Acteur.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Acteur> afficherActeur(Session session){
		return session.createQuery("select c from Acteur c").getResultList();
	}

	
}
