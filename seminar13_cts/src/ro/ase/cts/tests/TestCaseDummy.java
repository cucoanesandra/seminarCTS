package ro.ase.cts.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.IStudent;

class TestCaseDummy {
	private IStudent studentDummy;

	@BeforeEach
	void setUp() throws Exception {
		studentDummy=new StudentDummy();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdaugaStudent() {
		Grupa grupa=new Grupa(1002);
		grupa.adaugaStudent(studentDummy);
		
		assertEquals(1, grupa.getStudenti().size());
	}
	
	@Test
	void testAdaugaStudentCardinality() {
		Grupa grupa=new Grupa(1002);
		IStudent studentDummy2=new StudentDummy();
		IStudent studentDummy3=new StudentDummy();
		grupa.adaugaStudent(studentDummy);
		grupa.adaugaStudent(studentDummy2);
		grupa.adaugaStudent(studentDummy3);
		
		assertEquals(3, grupa.getStudenti().size());
	}

}
