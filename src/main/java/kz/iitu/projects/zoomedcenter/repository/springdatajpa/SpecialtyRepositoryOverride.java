package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import kz.iitu.projects.zoomedcenter.model.Specialty;
import org.springframework.context.annotation.Profile;

@Profile("spring-data-jpa")
public interface SpecialtyRepositoryOverride {
	
	public void delete(Specialty specialty);

}
