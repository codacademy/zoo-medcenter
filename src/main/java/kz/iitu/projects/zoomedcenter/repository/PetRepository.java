package kz.iitu.projects.zoomedcenter.repository;

import kz.iitu.projects.zoomedcenter.model.Pet;
import kz.iitu.projects.zoomedcenter.model.PetType;
import org.springframework.dao.DataAccessException;

import java.util.Collection;
import java.util.List;

public interface PetRepository {

    List<PetType> findPetTypes() throws DataAccessException;

    Pet findById(int id) throws DataAccessException;

    void save(Pet pet) throws DataAccessException;

    Collection<Pet> findAll() throws DataAccessException;

    void delete(Pet pet) throws DataAccessException;

}
