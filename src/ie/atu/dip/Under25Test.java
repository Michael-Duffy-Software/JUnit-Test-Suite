package ie.atu.dip;

import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

//Test Under 25 Class
class Under25Test {
	
	//Declare Values For Test
	public static String[] costResults = {"","","","","","",""};
	public static boolean exceptionWasThrown;
	public static String throwException;
	
	//Set The Expected Cost Result Before Tests
	@BeforeAll
	public static void setCostResults() {
		costResults[0] = "No surcharge\r\n" + "Total amount to pay: 600";
		costResults[1] = "Additional surcharge for accident: 50 \r\n" + "total amount to pay: 650";
		costResults[2] = "Additional surcharge for accident: 125 \r\n" + "total amount to pay: 725";
		costResults[3] = "Additional surcharge for accident: 225 \r\n" + "total amount to pay: 825";
		costResults[4] = "Additional surcharge for accident: 375 \r\n" + "total amount to pay: 975";
		costResults[5] = "Additional surcharge for accident: 575 \r\n" + "total amount to pay: 1175";
		costResults[6] = "No insurance";
	}
	
	//Reset The Test Values Before The Next Test
	@BeforeEach
	public void setTestValues() {
		exceptionWasThrown = false;
		throwException = "String";
	}
	
	//Rest The Expected Cost Values After The Test
	@AfterAll
	public static void resetCostResults() {
		costResults[0] = "";
		costResults[1] = "";
		costResults[2] = "";
		costResults[3] = "";
		costResults[4] = "";
		costResults[5] = "";
		costResults[6] = "";
	}
	
	
	//Test That The Correct Costs Are Returned For A Range of Values
	@ParameterizedTest
	@ValueSource(ints = {0,1,2,3,4,5,6})
	public void getCostTest(int accidents) {
		assertEquals(costResults[accidents],Under25.getCost(accidents));
	}
	
	//Test That Costs Are Returned and Printed Within A Given Time Range
	@Test
	@Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
	void printTimeTest() {
		for (int accidents = 0;accidents < 7; accidents++) {
			System.out.println(Under25.getCost(accidents));
		}
	}
	
	//Test That An Exception Is Thrown If A Negative Number of Accidents Is Given
	@Test
	void testValidateAccidentsNumberFormatException() {
		try {
			Under25.validateAccidents(throwException);
		} catch (NumberFormatException e) {
			exceptionWasThrown = true;
		}
		assertTrue(exceptionWasThrown);
	}
	
	
	
	
	
	

}
