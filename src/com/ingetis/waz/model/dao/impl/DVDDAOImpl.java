package com.ingetis.waz.model.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.ingetis.waz.model.DVD;
import com.ingetis.waz.model.dao.DVDDAO;

public class DVDDAOImpl implements DVDDAO {

	@Override
	public void ajouterDVD(DVD d, Session session) {
		session.beginTransaction();
		session.save(d);
		session.getTransaction().commit();
	}

	@Override
	public void supprimerDVD(Long id, Session session) {
		session.beginTransaction();
		DVD d = session.find(DVD.class, id);
		session.delete(d);
		session.getTransaction().commit();
	}

	@Override
	public void modifierDVD(DVD d, Session session) {
		session.beginTransaction();
		session.update(d);
		session.getTransaction().commit();
	}

	@Override
	public DVD afficherDVD(Long id, Session session) {
		return session.find(DVD.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<DVD> afficherDVD(Session session){
		return session.createQuery("select c from DVD c").getResultList();
	}
	
}
