package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import kz.iitu.projects.zoomedcenter.model.Specialty;
import kz.iitu.projects.zoomedcenter.repository.SpecialtyRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;

@Profile("spring-data-jpa")
public interface SpringDataSpecialtyRepository extends SpecialtyRepository, Repository<Specialty, Integer>, SpecialtyRepositoryOverride {

}
