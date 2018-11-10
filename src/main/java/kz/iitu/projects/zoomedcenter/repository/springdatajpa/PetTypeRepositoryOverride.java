package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import kz.iitu.projects.zoomedcenter.model.PetType;
import org.springframework.context.annotation.Profile;

@Profile("spring-data-jpa")
public interface PetTypeRepositoryOverride {
	
	public void delete(PetType petType);

}
