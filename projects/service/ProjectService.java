package projects.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {
	private static final String SCHEMA_FILE = "PROJECT_SCHEMA.SQL";
	private static final String DATA_FILE = "project_data.sql";
private ProjectDao projectDao = new ProjectDao();

public Project fetchProjectById(Integer projectId) throws Exception {
	Optional<Project> op = projectDao.fetchProjectById(projectId);
		
	return projectDao.fetchProjectById(projectId).orElseThrow( ()
			-> new NoSuchElementException
			("Project with Project ID=" + projectId 
					+ " does not exist."));
}
	
	
	
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}



	public List<Project> fetchAllProjects() {
		
		return projectDao.fetchAllProjects();
	}
}


	


