package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import kz.iitu.projects.zoomedcenter.model.PetType;
import kz.iitu.projects.zoomedcenter.repository.PetTypeRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;

@Profile("spring-data-jpa")
public interface SpringDataPetTypeRepository extends PetTypeRepository, Repository<PetType, Integer>, PetTypeRepositoryOverride {

}
