package ie.atu.dip;

import java.util.Scanner;

public class InsuranceProgram {

	// Main Method For Application
	public static void main(String[] args) {

		// Create A Scanner To Take Console Input From User
		Scanner input = new Scanner(System.in);
		// Create An Instance of An Applicant
		Applicant person = new Applicant();
		// Set The Age of The Applicant To The Console Input Given By The User
		person.setAge(person.validateAge(person.askAge()));

		// Check If The Applicant Age Is Under 25
		if (person.getAge() < 25) {
			// Print The Cost For The Applicant
			Under25.printCost(person);
		}

		// Check If The Applicant Age Is Over 25
		if (person.getAge() >= 25) {
			// Print The Cost For The Applicant
			Over25.printCost(person);
		}

	}
}
