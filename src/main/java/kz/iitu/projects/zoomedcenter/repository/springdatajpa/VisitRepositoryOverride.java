package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import kz.iitu.projects.zoomedcenter.model.Visit;
import org.springframework.context.annotation.Profile;

@Profile("spring-data-jpa")
public interface VisitRepositoryOverride {
	
	public void delete(Visit visit);

}
