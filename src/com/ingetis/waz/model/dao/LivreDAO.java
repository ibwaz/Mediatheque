package com.ingetis.waz.model.dao;

import java.util.List;

import org.hibernate.Session;
import com.ingetis.waz.model.Livre;

public interface LivreDAO {
	public void ajouterLivre(Livre li, Session session);
	public void supprimerLivre(Long id, Session session);
	public void modifierLivre(Livre li, Session session);
	public Livre afficherLivre(Long id, Session session);
	public List<Livre> afficherLivre(Session session);
}
