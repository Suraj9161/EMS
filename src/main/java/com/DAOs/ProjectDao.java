package com.DAOs;

import org.hibernate.Session;


import com.Configuration.HibernateUtil;
import com.Entities.Project;

public class ProjectDao {
	
	public void saveProject(Project project) {
        Session session =HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(project);
        session.getTransaction().commit();
        session.close();
    }

    public Project getProject(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Project project = session.get(Project.class, id);
        session.close();
        return project;
    }
}
