package de.kartellamt.commandline;

import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import de.kartellamt.db.dao.GisnetDBOperations;
import de.kartellamt.db.entities.ProjectGroup;

public class ProjectSelection {
	
	private final String  PREFIX = "KARTELLAMT_";
	
	
	public HashSet<String> autorizatedProjects () {
		HashSet<String> autorizatedProjects = new HashSet<>();
		HashSet<String> groupList = CommandlineExecuter.getUserDomainGroupList();
		List<ProjectGroup> projects = GisnetDBOperations.getSingeltonGisnetDBOperationsObject().getProjectGroup();
		for (ProjectGroup project : projects) {
			String tmp = StringUtils.remove(project.getGngroup(), PREFIX);
			if (groupList.contains(StringUtils.remove(project.getGngroup(), PREFIX))) {
				autorizatedProjects.add(project.getProject());
			}
		}				
		return autorizatedProjects;
	}

}
