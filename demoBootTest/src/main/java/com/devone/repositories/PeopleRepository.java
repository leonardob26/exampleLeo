package com.devone.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devone.entities.People;


@Repository
public interface PeopleRepository extends CrudRepository<People, Integer> {
	List<People> findByPname(String pname);
}
