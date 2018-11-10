package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import kz.iitu.projects.zoomedcenter.model.Vet;
import kz.iitu.projects.zoomedcenter.repository.VetRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;

@Profile("spring-data-jpa")
public interface SpringDataVetRepository extends VetRepository, Repository<Vet, Integer> {
}
