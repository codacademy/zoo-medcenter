package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import kz.iitu.projects.zoomedcenter.model.Pet;
import org.springframework.context.annotation.Profile;

@Profile("spring-data-jpa")
public interface PetRepositoryOverride {
	
	public void delete(Pet pet);

}
