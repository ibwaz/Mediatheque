package com.ingetis.waz.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.ingetis.waz.model.dao.impl.ActeurDAOImpl;
import com.ingetis.waz.model.dao.impl.AdherentDAOImpl;
import com.ingetis.waz.model.dao.impl.AdresseDAOImpl;
import com.ingetis.waz.model.dao.impl.AuteurDAOImpl;
import com.ingetis.waz.model.dao.impl.CDDAOImpl;
import com.ingetis.waz.model.dao.impl.ChanteurDAOImpl;
import com.ingetis.waz.model.dao.impl.ProducteurDAOImpl;
import com.ingetis.waz.model.dao.impl.RealisateurDAOImpl;
import com.ingetis.waz.model.dao.impl.DVDDAOImpl;
import com.ingetis.waz.model.dao.impl.LivreDAOImpl;
import com.ingetis.waz.model.dao.impl.LivreInfoDAOImpl;

public class HibernateGestion {
	
	public static SessionFactory sf;
	public static Session session;
	
	public static ActeurDAOImpl daoActeur;
	public static ChanteurDAOImpl daoChanteur;
	public static ProducteurDAOImpl daoProducteur;
	public static AdherentDAOImpl daoAdherent;
	public static DVDDAOImpl daoDVD;
	public static CDDAOImpl daoCD;
	public static RealisateurDAOImpl daoRealisateur;
	public static AuteurDAOImpl daoAuteur;
	public static AdresseDAOImpl daoAdresse;
	public static LivreInfoDAOImpl daoLivreInfo;
	public static LivreDAOImpl daoLivre;
	// add My service
	//session.beginTransaction();
	//session.getTransaction().commit();
	
	
	public static Session getHibernateSassion() {
		Configuration conf = new Configuration();
		sf = conf.configure().buildSessionFactory();
		session = sf.openSession();
		
		//  services
		daoActeur = new ActeurDAOImpl();
		daoChanteur = new ChanteurDAOImpl();
		daoProducteur = new ProducteurDAOImpl();
		daoAdherent = new AdherentDAOImpl();
		daoRealisateur = new RealisateurDAOImpl();
		daoAuteur = new AuteurDAOImpl();
		daoDVD = new DVDDAOImpl();
		daoCD = new CDDAOImpl();
		daoAdresse = new AdresseDAOImpl();
		daoLivreInfo = new LivreInfoDAOImpl();
		daoLivre = new LivreDAOImpl();
		
		return session;
	}
	
	public static void closeHibernateSassion() {
		session.close();
		sf.close();
	}
	
}
