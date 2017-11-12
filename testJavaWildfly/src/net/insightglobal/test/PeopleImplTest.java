package net.insightglobal.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import net.insightglobal.model.PeopleImpl;
import net.insightglobal.repositories.PeopleRepository;
import net.insightglobal.repositories.VehicleRepository;

@RunWith(MockitoJUnitRunner.class)
public class PeopleImplTest {
	@Mock
	private PeopleRepository repo;

	@Mock
	private VehicleRepository repoVehicle;
	@InjectMocks
	private PeopleImpl peopleImpl;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetPeoplesList() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetPeopleVehicle() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetPeople() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testInsert() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDelete() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testUpdate() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testInsertPeopleVehicles() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDeletePeopleVehicles() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
