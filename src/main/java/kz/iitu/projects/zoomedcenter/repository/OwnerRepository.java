package kz.iitu.projects.zoomedcenter.repository;

import kz.iitu.projects.zoomedcenter.model.Owner;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface OwnerRepository {

    Collection<Owner> findByLastName(String lastName) throws DataAccessException;

    Owner findById(int id) throws DataAccessException;

    void save(Owner owner) throws DataAccessException;

    Collection<Owner> findAll() throws DataAccessException;

    void delete(Owner owner) throws DataAccessException;

}
