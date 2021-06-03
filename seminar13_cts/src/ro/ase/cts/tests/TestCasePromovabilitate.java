package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.IStudent;

public class TestCasePromovabilitate {
	private IStudent studentStub=new StudentStub();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPromovabilitate() {
		Grupa grupa=new Grupa(1010);
		grupa.adaugaStudent(studentStub);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

}
