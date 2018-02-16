package com.ingetis.waz.model.dao.impl;

import java.util.List;

import org.hibernate.Session;
import com.ingetis.waz.model.Producteur;
import com.ingetis.waz.model.dao.ProducteurDAO;

public class ProducteurDAOImpl implements ProducteurDAO {

	@Override
	public void ajouterProducteur(Producteur p, Session session) {
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}

	@Override
	public void supprimerProducteur(Long id, Session session) {
		session.beginTransaction();
		Producteur p = session.find(Producteur.class, id);
		session.delete(p);
		session.getTransaction().commit();
	}

	@Override
	public void modifierProducteur(Producteur p, Session session) {
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}

	@Override
	public Producteur afficherProducteur(Long id, Session session) {
		return session.find(Producteur.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Producteur> afficherProducteur(Session session){
		return session.createQuery("select c from Producteur c").getResultList();
	}
	
}
