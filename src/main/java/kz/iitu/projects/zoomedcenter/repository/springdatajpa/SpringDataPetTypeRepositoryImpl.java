package kz.iitu.projects.zoomedcenter.repository.springdatajpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import kz.iitu.projects.zoomedcenter.model.Pet;
import kz.iitu.projects.zoomedcenter.model.PetType;
import kz.iitu.projects.zoomedcenter.model.Visit;
import org.springframework.context.annotation.Profile;

@Profile("spring-data-jpa")
public class SpringDataPetTypeRepositoryImpl implements PetTypeRepositoryOverride {
	
	@PersistenceContext
    private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public void delete(PetType petType) {
		String petTypeId = petType.getId().toString();
		
		List<Pet> pets = new ArrayList<Pet>();
		pets = this.em.createQuery("SELECT pet FROM Pet pet WHERE type_id=" + petTypeId).getResultList();
		for (Pet pet : pets){
			List<Visit> visits = new ArrayList<Visit>();
			visits = pet.getVisits();
			for (Visit visit : visits){
				this.em.createQuery("DELETE FROM Visit visit WHERE id=" + visit.getId().toString()).executeUpdate();
			}
			this.em.createQuery("DELETE FROM Pet pet WHERE id=" + pet.getId().toString()).executeUpdate();
		}
		this.em.createQuery("DELETE FROM PetType pettype WHERE id=" + petTypeId).executeUpdate();
	}

}
