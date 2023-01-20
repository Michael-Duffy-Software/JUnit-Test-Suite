package ie.atu.dip;

import java.util.Scanner;

//Age Under 25 Class
public class Under25 {

	//Print The Cost For A Given Applicant Based On Their Accidents
	public static void printCost(Applicant person) {
		//Set The Number of Accidents For The Applicant To Number Given Once Validated
		person.setAccidents(Under25.validateAccidents(Under25.askAccidents()));
		//Print Out The Cost Based On The Number of Accidents
		System.out.println(getCost(person.getAccidents()));
	}
	
	//Ask The User For The Number of Accidents
	public static String askAccidents() {
		Scanner input = new Scanner(System.in);
		System.out.println("Additional surcharge 100");
		System.out.print("\nHow many accidents did you have? ");
		return input.nextLine();
	}
	
	//Validate The Number of Accidents Given : This Will Throw An Exception If An Integer Is Not Given
	public static int validateAccidents(String accidentsGiven) {
		return Integer.parseInt(accidentsGiven);
		
	}

	//Return A Cost To Print Based On The Number of Accidents Given
	public static String getCost(int accidents) {

		if (accidents == 0) {
			return "No surcharge\r\n" + "Total amount to pay: 600";
		}

		if (accidents == 1) {
			return "Additional surcharge for accident: 50 \r\n" + "total amount to pay: 650";
		}

		if (accidents == 2) {
			return "Additional surcharge for accident: 125 \r\n" + "total amount to pay: 725";
		}

		if (accidents == 3) {
			return "Additional surcharge for accident: 225 \r\n" + "total amount to pay: 825";
		}

		if (accidents == 4) {
			return "Additional surcharge for accident: 375 \r\n" + "total amount to pay: 975";
		}

		if (accidents == 5) {
			return "Additional surcharge for accident: 575 \r\n" + "total amount to pay: 1175";
		}

		else {
			return "No insurance";
		}

	}

}
