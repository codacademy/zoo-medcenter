package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import kz.iitu.projects.zoomedcenter.model.Visit;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.DataAccessException;

@Profile("spring-data-jpa")
public class SpringDataVisitRepositoryImpl implements VisitRepositoryOverride {
	
	@PersistenceContext
    private EntityManager em;

	@Override
	public void delete(Visit visit) throws DataAccessException {
		String visitId = visit.getId().toString();
		this.em.createQuery("DELETE FROM Visit visit WHERE id=" + visitId).executeUpdate();
	}


}
