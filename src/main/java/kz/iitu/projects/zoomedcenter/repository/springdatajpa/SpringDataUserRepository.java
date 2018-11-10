package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import kz.iitu.projects.zoomedcenter.model.User;
import kz.iitu.projects.zoomedcenter.repository.UserRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;

@Profile("spring-data-jpa")
public interface SpringDataUserRepository extends UserRepository, Repository<User, Integer>  {

}
