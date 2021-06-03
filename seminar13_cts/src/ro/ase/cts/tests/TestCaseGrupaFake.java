package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.IStudent;
import ro.ase.cts.tests.suite.categorii.TesteGetPromovabilitate;
import ro.ase.cts.tests.suite.categorii.TesteNormale;
import ro.ase.cts.tests.suite.categorii.TesteUrgente;

public class TestCaseGrupaFake {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Category({TesteNormale.class, TesteGetPromovabilitate.class})
	@Test
	public void testPromovabilitate() {
		StudentFake studentFake=new StudentFake();
		studentFake.setNume("Stud");
		studentFake.setAreRestanta(false);
		Grupa grupa=new Grupa(1010);
		grupa.adaugaStudent(studentFake);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
		
	}
	
	@Category({TesteUrgente.class, TesteGetPromovabilitate.class})
	@Test
	public void testPromovabilitateRestanta() {
		StudentFake studentFake=new StudentFake();
		studentFake.setNume("Stud");
		studentFake.setAreRestanta(true);
		Grupa grupa=new Grupa(1020);
		grupa.adaugaStudent(studentFake);
		
		assertEquals(0, grupa.getPromovabilitate(), 0.01);
		
	}

}
