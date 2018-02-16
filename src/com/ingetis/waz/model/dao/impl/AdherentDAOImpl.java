package com.ingetis.waz.model.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.ingetis.waz.model.Adherent;

import com.ingetis.waz.model.dao.AdherentDAO;

public class AdherentDAOImpl implements AdherentDAO {

	@Override
	public void ajouterAdherent(Adherent ad, Session session) {
		session.beginTransaction();
		session.save(ad);
		session.getTransaction().commit();
	}

	@Override
	public void supprimerAdherent(Long id, Session session) {
		session.beginTransaction();
		Adherent ad = session.find(Adherent.class, id);
		session.delete(ad);
		session.getTransaction().commit();
	}

	@Override
	public void modifierAdherent(Adherent ad, Session session) {
		session.beginTransaction();
		session.save(ad);
		session.getTransaction().commit();
	}

	@Override
	public Adherent afficherAdherent(Long id, Session session) {
		return session.find(Adherent.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Adherent> afficherAdherent(Session session){
		return session.createQuery("select c from Adherent c").getResultList();
	}

}
