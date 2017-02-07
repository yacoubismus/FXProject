package de.kartellamt.db.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import de.kartellamt.db.entities.ProjectGroup;
import de.kartellamt.singelton.entitymanagerfactory.EntityManagerCreator;

public class GisnetDBOperations {
	
	public static GisnetDBOperations gisnetDBOperations;
	
	EntityManager emGisnet;
	
	private GisnetDBOperations () {
		
	}
	
	private EntityManager entityManagerCreator () {
		return this.emGisnet = new EntityManagerCreator().getGisnetEntityManager();
	}
	
	public static GisnetDBOperations getSingeltonGisnetDBOperationsObject() {
		if (gisnetDBOperations == null) {
			gisnetDBOperations = new GisnetDBOperations ();
		} 
		 return gisnetDBOperations;
	}
	
	public List<ProjectGroup> getProjectGroup() {
		TypedQuery<ProjectGroup> query = entityManagerCreator ().createNamedQuery("ProjectGroup.findAll", ProjectGroup.class);
		return query.getResultList();

	}

}
