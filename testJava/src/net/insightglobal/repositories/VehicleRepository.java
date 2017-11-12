package net.insightglobal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.insightglobal.jpa.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {
	List<Vehicle> findByVname(String vname);
}
