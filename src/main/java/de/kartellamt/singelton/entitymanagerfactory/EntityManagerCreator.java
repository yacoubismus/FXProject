package de.kartellamt.singelton.entitymanagerfactory;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerCreator {

	private static final String PERSISTENCE_UNIT_NAME_GISNET = "gisnet";

	private static final EntityManagerFactory factory = Persistence
			.createEntityManagerFactory(PERSISTENCE_UNIT_NAME_GISNET);

	public EntityManager getGisnetEntityManager() {
		return factory.createEntityManager();
	}

}
