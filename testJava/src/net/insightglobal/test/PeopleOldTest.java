package net.insightglobal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;
//import org.apache.juli.logging.LogFactory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

//import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

//import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;



public class PeopleOldTest {
	/*private static MysqlConnectionPoolDataSource ds;
	private static PeopleOld pe = new PeopleOld();
	private int idPeople;
	private int idPeopleVehicles;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
            // Create initial context
            System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.naming.java.javaURLContextFactory");
            System.setProperty(Context.URL_PKG_PREFIXES, "org.apache.naming");            
            Context ic = new InitialContext();
            
            ic.createSubcontext("java:");
            ic.createSubcontext("java:/comp");
            ic.createSubcontext("java:/comp/env");
            ic.createSubcontext("java:/comp/env/jdbc");
            ds = new MysqlConnectionPoolDataSource();
            ds.setUrl("jdbc:mysql://localhost:3306/mycar");
            ds.setUser("root");
            ds.setPassword("admin");     
            ic.bind("java:/comp/env/jdbc/mycar", ds);
            pe.setDb(new Db(ds));
        } catch (NamingException ex) {
            Logger.getLogger(ex.getMessage());
        }
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		pe.closeDb();
	}
	
	@Test
	public void testGetPeoplesList() throws Exception {	
		String rst = pe.getPeoplesList();
		assertTrue(rst.length()>0 && !rst.contains("Error"));
	}

	@Test
	public void testGetPeopleVehicle() throws Exception {
		pe.setId(1);
		pe.getPeopleVehicle();
		assertTrue("Steve Jobs".equals(pe.getName()));
		assertFalse(pe.getCmbVehicles().isEmpty());
	}

	@Test
	public void testGetPeople() throws Exception {
		pe.getPeople(1);
		assertTrue("Steve Jobs".equals(pe.getName()));
		assertFalse(pe.getVehiclesList().isEmpty());
	}

	@Test
	public void testInsert() throws Exception {
		pe.setName("Borrar");
		idPeople = pe.insert();
		assertTrue(idPeople>0);
		
		pe.getPeople(idPeople);
		assertTrue(pe.getName().equals("Borrar"));
	}
	@Test
	public void testDelete() throws Exception {
		pe.getLastIdPeople();
		assertEquals(1, pe.delete());
	}	
	@Test
	public void testUpdate() throws Exception {		
		pe.getLastIdPeople();
		pe.setName("Borrar1");
		assertEquals(1, pe.update());
	}
	@Test
	public void testInsertAndDeletePeopleVehicles() throws Exception {
		// idPeople is setting in the previous method
		pe.setVehicleId(1);
		pe.setName("Borrar");
		idPeople = pe.insert();
		pe.setId(idPeople);
		idPeopleVehicles = pe.insertPeopleVehicles();
		
		pe.getPeopleVehicles(idPeopleVehicles);
		assertEquals(pe.getId() ,idPeople);
		assertEquals(pe.getVehicleId(), 1);
		assertEquals(1, pe.deletePeopleVehicles(idPeopleVehicles));
	}*/

}
