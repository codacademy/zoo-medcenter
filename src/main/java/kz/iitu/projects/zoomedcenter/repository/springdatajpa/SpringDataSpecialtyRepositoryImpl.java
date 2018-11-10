package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import kz.iitu.projects.zoomedcenter.model.Specialty;
import org.springframework.context.annotation.Profile;

@Profile("spring-data-jpa")
public class SpringDataSpecialtyRepositoryImpl implements SpecialtyRepositoryOverride {
	
	@PersistenceContext
    private EntityManager em;

	@Override
	public void delete(Specialty specialty) {
		String specId = specialty.getId().toString();
		this.em.createNativeQuery("DELETE FROM vet_specialties WHERE specialty_id=" + specId).executeUpdate();
		this.em.createQuery("DELETE FROM Specialty specialty WHERE id=" + specId).executeUpdate();
	}

}
