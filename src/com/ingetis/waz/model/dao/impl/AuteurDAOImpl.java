package com.ingetis.waz.model.dao.impl;

import java.util.List;

import org.hibernate.Session;
import com.ingetis.waz.model.Auteur;
import com.ingetis.waz.model.dao.AuteurDAO;

public class AuteurDAOImpl implements AuteurDAO {

	@Override
	public void ajouterAuteur(Auteur au, Session session) {
		session.beginTransaction();
		session.save(au);
		session.getTransaction().commit();
	}

	@Override
	public void supprimerAuteur(Long id, Session session) {
		session.beginTransaction();
		Auteur au = session.find(Auteur.class, id);
		session.delete(au);
		session.getTransaction().commit();
	}

	@Override
	public void modifierAuteur(Auteur au, Session session) {
		session.beginTransaction();
		session.save(au);
		session.getTransaction().commit();
	}

	@Override
	public Auteur afficherAuteur(Long id, Session session) {
		return session.find(Auteur.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Auteur> afficherAuteur(Session session){
		return session.createQuery("select c from Auteur c").getResultList();
	}
	
}
