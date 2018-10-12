package kz.iitu.projects.zoomedcenter.service;

import kz.iitu.projects.zoomedcenter.model.Owner;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface MedcenterService {

    Owner findOwnerById(int id) throws DataAccessException;
    Collection<Owner> findAllOwners() throws DataAccessException;
    void saveOwner(Owner owner) throws DataAccessException;
    void deleteOwner(Owner owner) throws DataAccessException;
    Collection<Owner> findOwnerByLastName(String lastName) throws DataAccessException;

}
