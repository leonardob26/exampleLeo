package net.insightglobal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.insightglobal.jpa.People;

@Repository
public interface PeopleRepository extends CrudRepository<People, Integer> {
	List<People> findByPname(String pname);
}
