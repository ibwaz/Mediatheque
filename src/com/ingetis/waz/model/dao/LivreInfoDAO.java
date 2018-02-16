package com.ingetis.waz.model.dao;

import java.util.List;

import org.hibernate.Session;


import com.ingetis.waz.model.LivreInfo;

public interface LivreInfoDAO {
	public void ajouterLivreInfo(LivreInfo liv, Session session);
	public void supprimerLivreInfo(Long id, Session session);
	public void modifierLivreInfo(LivreInfo liv, Session session);
	public LivreInfo afficherLivreInfo(Long id, Session session);
	public List<LivreInfo> afficherLivreInfo(Session session);
}
