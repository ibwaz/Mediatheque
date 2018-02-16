package com.ingetis.waz.model.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.ingetis.waz.model.CD;
import com.ingetis.waz.model.dao.CDDAO;

public class CDDAOImpl implements CDDAO {

	@Override
	public void ajouterCD(CD c, Session session) {
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}

	@Override
	public void supprimerCD(Long id, Session session) {
		session.beginTransaction();
		CD c = session.find(CD.class, id);
		session.delete(c);
		session.getTransaction().commit();
	}

	@Override
	public void modifierCD(CD c, Session session) {
		session.beginTransaction();
		session.update(c);
		session.getTransaction().commit();
	}

	@Override
	public CD afficherCD(Long id, Session session) {
		return session.find(CD.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<CD> afficherCD(Session session){
		return session.createQuery("select c from CD c").getResultList();
	}
	
}
