package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import java.util.List;

import kz.iitu.projects.zoomedcenter.model.Pet;
import kz.iitu.projects.zoomedcenter.model.PetType;
import kz.iitu.projects.zoomedcenter.repository.PetRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

@Profile("spring-data-jpa")
public interface SpringDataPetRepository extends PetRepository, Repository<Pet, Integer>, PetRepositoryOverride {

    @Override
    @Query("SELECT ptype FROM PetType ptype ORDER BY ptype.name")
    List<PetType> findPetTypes() throws DataAccessException;
}
