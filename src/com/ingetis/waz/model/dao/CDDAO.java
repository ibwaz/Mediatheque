package com.ingetis.waz.model.dao;

import java.util.List;

import org.hibernate.Session;
import com.ingetis.waz.model.CD;

public interface CDDAO {
	public void ajouterCD(CD c, Session session);
	public void supprimerCD(Long id, Session session);
	public void modifierCD(CD c, Session session);
	public CD afficherCD(Long id, Session session);
	public List<CD> afficherCD(Session session);
}
