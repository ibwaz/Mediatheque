package com.ingetis.waz.model.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.ingetis.waz.model.Adresse;
import com.ingetis.waz.model.dao.AdresseDAO;

public class AdresseDAOImpl implements AdresseDAO {

	@Override
	public void ajouterAdresse(Adresse adr, Session session) {
		session.beginTransaction();
		session.save(adr);
		session.getTransaction().commit();
	}

	@Override
	public void supprimerAdresse(Long id, Session session) {
		session.beginTransaction();
		Adresse adr = session.find(Adresse.class, id);
		session.delete(adr);
		session.getTransaction().commit();
	}

	@Override
	public void modifierAdresse(Adresse adr, Session session) {
		session.beginTransaction();
		session.save(adr);
		session.getTransaction().commit();
	}

	@Override
	public Adresse afficherAdresse(Long id, Session session) {
		return session.find(Adresse.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Adresse> afficherAdresse(Session session){
		return session.createQuery("select c from Adresse c").getResultList();
	}
	
}
