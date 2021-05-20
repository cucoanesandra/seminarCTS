package to.ase.cts.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.clase.Student;

class StudentTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testConstructorRightName() {
		String nume="Ion";
		Student student=new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testListAddNote() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testListSize() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	void testCalculeazaMedieSingaNota(){
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	void testCalculeazaMedieMulteNote(){
		Student student=new Student();
		int nota1=8;
		int nota2=7;
		int nota3=5;
		
		float medie=(nota1+nota2+nota3)/3.0f;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertEquals(medie, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	void testCalculeazaMedieFaraNota(){
		Student student=new Student();

		assertEquals(0, student.calculeazaMedie(), 0.01);
	}

	
	@Test
	void testGetNotaOutofBounds(){
		Student student=new Student();
		int nota=9;
		student.adaugaNota(nota);
		
		assertThrows(IndexOutOfBoundsException.class, ()->student.getNota(-1));
	}
	
	
	//pt JUnit3
	@Test
	void testGetNotaOutofBoundsJU3(){
		Student student=new Student();
		int nota=9;
		student.adaugaNota(nota);
		try {
			int x=student.getNota(-1);
			fail("Testul a esuat pentru ca nu a aruncat IndexOutOfBoundsException");
			}
		catch (IndexOutOfBoundsException err) {
			
		}
	}
	
	@Test
	void testVerificaRestanta() {
		Student student=new Student();
		int nota1=9;
		int nota2=6;
		int nota3=4;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertFalse(student.areRestante());
	}
}


