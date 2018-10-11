package kz.iitu.projects.zoomedcenter.repository;

import kz.iitu.projects.zoomedcenter.model.User;
import org.springframework.dao.DataAccessException;

public interface UserRepository {

    void save(User user) throws DataAccessException;

}
