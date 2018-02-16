package com.ingetis.waz.model.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.ingetis.waz.model.Chanteur;
import com.ingetis.waz.model.dao.ChanteurDAO;

public class ChanteurDAOImpl implements ChanteurDAO{

	@Override
	public void ajouterChanteur(Chanteur c, Session session) {
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}

	@Override
	public void supprimerChanteur(Long id, Session session) {
		session.beginTransaction();
		Chanteur c = session.find(Chanteur.class, id);
		session.delete(c);
		session.getTransaction().commit();
	}

	@Override
	public void modifierChanteur(Chanteur c, Session session) {
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}

	@Override
	public Chanteur afficherChanteur(Long id, Session session) {
		return session.find(Chanteur.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Chanteur> afficherChanteur(Session session){
		return session.createQuery("select c from Chanteur c").getResultList();
	}

}
