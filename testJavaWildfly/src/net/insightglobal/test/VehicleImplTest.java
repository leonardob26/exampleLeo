package net.insightglobal.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import net.insightglobal.config.AppConfig;
import net.insightglobal.model.VehicleImpl;



//@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@Transactional
public class VehicleImplTest {
	
	@Autowired
	private VehicleImpl vehicleImpl;

	//private VehicleRepository repository;
	@Test
	public void testGetVehiclesList() throws Exception {
		String vehiclesHTML = vehicleImpl.getVehiclesList();
		assertTrue(vehiclesHTML.contains("><a href=selVehicles.do?id="));
	}

	@Test
	public void testGetVehicle() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDelete() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testInsert() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testUpdate() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
