package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.IStudent;
import ro.ase.cts.tests.suite.categorii.TesteGetPromovabilitate;
import ro.ase.cts.tests.suite.categorii.TesteUrgente;

public class TestCasePromovabilitate {
	private IStudent studentStub=new StudentStub();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Category({TesteUrgente.class, TesteGetPromovabilitate.class})
	@Test
	public void testGetPromovabilitate() {
		Grupa grupa=new Grupa(1010);
		grupa.adaugaStudent(studentStub);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

}
