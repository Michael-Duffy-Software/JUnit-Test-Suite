package ie.atu.dip;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

//Test For Applicant Class
class ApplicantTest {
	
	//Declare Values Used For Tests
	public static Applicant personTest;
	public static int ageToSetInput = 0;
	public static int accidentsToSetInput = 0;
	public static String throwExceptionString;
	public static int throwExceptionInt;
	public static boolean exceptionWasThrown;
	
	//Set The Values Needed For The Tests
	@BeforeAll
	public static void setInputs() {
		ageToSetInput = 10;
		accidentsToSetInput = 3;
		throwExceptionString = "String";
		throwExceptionInt = -1;
		exceptionWasThrown = false;
	}
	
	//Create A New Instance of Applicant To Test
	@BeforeEach
	public void createTestApplicant() {
		personTest = new Applicant();
	}
	
	//Reset The Values Before The Next Test
	@AfterEach
	public void resetTestValues(){
		personTest.setAge(0);
		personTest.setAccidents(0);
		exceptionWasThrown = false;
	}
	
	//Reset All Values After All Tests
	@AfterAll
	public static void resetInputs() {
		ageToSetInput = 0;
		accidentsToSetInput = 0;
		throwExceptionString = "";
		throwExceptionInt = 0;
		exceptionWasThrown = false;
	}
	
	//Test The Age Getter And Setter Methods
	@Test
	void ageGetterSetterTest() {
		personTest.setAge(ageToSetInput);
		assertEquals(ageToSetInput, personTest.getAge());
	}

	//Test The Accident Getter And Setter Methods
	@Test
	void accidentsGetterSetterTest() {
		personTest.setAccidents(accidentsToSetInput);
		assertEquals(accidentsToSetInput, personTest.getAccidents());
	}
	
	//Test That An Exception Is Thrown If An Age That Is Not An Integer Is Given
	@Test
	void testValidateAgeNumberFormatException() {
		try {
			personTest.validateAge(throwExceptionString);
		} catch (NumberFormatException e) {
			exceptionWasThrown = true;
		}
		assertTrue(exceptionWasThrown);
	}
	
	//Test That An Exception Is Thrown If An Age That Is Less Than 0 Is Given
	@Test
	void testSetAgeIllegalArgumentException() {
		try {
			personTest.setAge(throwExceptionInt);
		} catch (IllegalArgumentException e) {
			exceptionWasThrown = true;
		}
		assertTrue(exceptionWasThrown);
	}
	
	//Test That An Exception Is Thrown If An Accident Number That Is Less Than 0 Is Given
	@Test
	void testSetAccidentsIllegalArgumentException() {
		try {
			personTest.setAccidents(throwExceptionInt);
		} catch (IllegalArgumentException e) {
			exceptionWasThrown = true;
		}
		assertTrue(exceptionWasThrown);
	}
	
}
