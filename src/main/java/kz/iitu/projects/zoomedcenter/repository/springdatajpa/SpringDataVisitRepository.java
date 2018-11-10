package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import kz.iitu.projects.zoomedcenter.model.Visit;
import kz.iitu.projects.zoomedcenter.repository.VisitRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;

@Profile("spring-data-jpa")
public interface SpringDataVisitRepository extends VisitRepository, Repository<Visit, Integer>, VisitRepositoryOverride {
}
