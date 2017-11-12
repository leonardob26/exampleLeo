package net.insightglobal.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

//import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

public class VehicleOldTest {
	/*private static MysqlConnectionPoolDataSource ds;
	private static Vehicles ve = new Vehicles();
	private int idVehicles;
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
            ve.setDb(new Db(ds));
        } catch (NamingException ex) {
            Logger.getLogger(ex.getMessage());
        }
		
		*//**
		 * The following is for SuitTest
		 *//*
		ds = new MysqlConnectionPoolDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/mycar");
        ds.setUser("root");
        ds.setPassword("admin");
		ve.setDb(new Db(ds));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		ve.closeDb();
	}

	@Test
	public void testGetVehiclesList() throws Exception {
		String rst = ve.getVehiclesList();
		assertTrue(rst.length()>0 && !rst.contains("Error"));
	}

	@Test
	public void testGetVehicle() throws Exception {
		ve.getVehicle(1);
		assertTrue("Ducati Monster 1100".equals(ve.getName()));
		assertEquals(1, ve.getId());
	}

	@Test
	public void testDelete() throws Exception {
		ve.getLastIdVehicles();
		assertEquals(1, ve.delete());
	}

	@Test
	public void testInsert() throws Exception {
		ve.setName("Borrar1");
		idVehicles = ve.insert();
		assertTrue(idVehicles>0);
		ve.getVehicle(idVehicles);
		assertTrue(ve.getName().equals("Borrar1"));
	}

	@Test
	public void testUpdate() throws Exception {
		ve.getLastIdVehicles();
		ve.setName("Borrar2");
		assertEquals(1, ve.update());
	}*/
}
