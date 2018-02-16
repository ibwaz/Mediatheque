package com.ingetis.waz.model.dao.impl;

import java.util.List;

import org.hibernate.Session;
import com.ingetis.waz.model.Livre;
import com.ingetis.waz.model.dao.LivreDAO;

public class LivreDAOImpl implements LivreDAO {

	@Override
	public void ajouterLivre(Livre li, Session session) {
		session.beginTransaction();
		session.save(li);
		session.getTransaction().commit();
	}

	@Override
	public void supprimerLivre(Long id, Session session) {
		session.beginTransaction();
		Livre li = session.find(Livre.class, id);
		session.delete(li);
		session.getTransaction().commit();
	}

	@Override
	public void modifierLivre(Livre li, Session session) {
		session.beginTransaction();
		session.update(li);
		session.getTransaction().commit();
	}

	@Override
	public Livre afficherLivre(Long id, Session session) {
		return session.find(Livre.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Livre> afficherLivre(Session session){
		return session.createQuery("select c from Livre c").getResultList();
	}
}
