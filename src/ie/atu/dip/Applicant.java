package ie.atu.dip;

import java.util.Scanner;

//Applicant Class
public class Applicant {

	// Declare Instance Variables
	private Scanner input = new Scanner(System.in);
	private int age;
	private int accidents;

	// Ask The User For An Age
	public String askAge() {
		System.out.print("Enter your age: ");
		// Return The Console Input Given
		return input.nextLine();
	}

	// Check That The Age Given Is An Integer
	public int validateAge(String ageGiven) {
		// Convert The Console String To An Integer : This Will Throw An Exception If
		// Input Is Not An Integer
		return Integer.parseInt(ageGiven);
	}

	// Set The Applicant Age To The Age Given
	public void setAge(int age) {
		// Throw An Exception If The Age Is Less Than 0
		if (age < 0) {
			throw new IllegalArgumentException();
		}
		this.age = age;
	}

	// Set The Applicant Accidents To The Accidents Given
	public void setAccidents(int accidents) {
		// Throw An Exception If The Accidents Given Is Less Than 0
		if (accidents < 0) {
			throw new IllegalArgumentException();
		}
		this.accidents = accidents;
	}

	// Return The Applicant Age
	public int getAge() {
		return this.age;
	}

	// Return The Applicant Accidents
	public int getAccidents() {
		return this.accidents;
	}

}
