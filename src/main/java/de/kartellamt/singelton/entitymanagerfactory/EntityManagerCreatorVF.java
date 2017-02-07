package de.kartellamt.singelton.entitymanagerfactory;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.commons.lang3.StringUtils;

public class EntityManagerCreatorVF {

	private static final String PERSISTENCE_UNIT_NAME_VF = "VF";

	private static EntityManagerFactory emf;

	private static String url;

	public EntityManager createEntityManagerVF(String urlDB) {

		if (!StringUtils.isNotEmpty(url)) {
			url = urlDB;
			return getVFEntityManagerFactory(url).createEntityManager();
		} else if (!StringUtils.equals(url, urlDB)) {
			url = urlDB;
		}

		return emf.createEntityManager();
	}

	private EntityManagerFactory getVFEntityManagerFactory(String url) {
		Properties props = new Properties();
		props.setProperty("javax.persistence.jdbc.url", url);
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME_VF, props);
		return emf;
	}

}
