package com.ingetis.waz.model.dao.impl;

import java.util.List;

import org.hibernate.Session;
import com.ingetis.waz.model.LivreInfo;
import com.ingetis.waz.model.dao.LivreInfoDAO;

public class LivreInfoDAOImpl implements LivreInfoDAO {

	@Override
	public void ajouterLivreInfo(LivreInfo liv, Session session) {
		session.beginTransaction();
		session.save(liv);
		session.getTransaction().commit();
	}

	@Override
	public void supprimerLivreInfo(Long id, Session session) {
		session.beginTransaction();
		LivreInfo liv = session.find(LivreInfo.class, id);
		session.delete(liv);
		session.getTransaction().commit();
	}

	@Override
	public void modifierLivreInfo(LivreInfo liv, Session session) {
		session.beginTransaction();
		session.update(liv);
		session.getTransaction().commit();
	}

	@Override
	public LivreInfo afficherLivreInfo(Long id, Session session) {
		return session.find(LivreInfo.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<LivreInfo> afficherLivreInfo(Session session){
		return session.createQuery("select c from LivreInfo c").getResultList();
	}
}
