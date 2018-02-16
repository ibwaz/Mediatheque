package com.ingetis.waz.model.dao;

import java.util.List;

import org.hibernate.Session;


import com.ingetis.waz.model.DVD;

public interface DVDDAO {
	public void ajouterDVD(DVD d, Session session);
	public void supprimerDVD(Long id, Session session);
	public void modifierDVD(DVD d, Session session);
	public DVD afficherDVD(Long id, Session session);
	public List<DVD> afficherDVD(Session session);
}
