package assignment9_1;

import java.util.HashMap;
import java.util.Scanner;

/*
 * This example source code demonstrates the use of  
 * HashMap class by inserting employee id as key and name as value.
 */

public class Assignment9_1 {
	public static void main(String[] args) {
		// declare the hashmap with generic type String
		HashMap<Integer, String> employeeDetails = new HashMap<Integer, String>();

		boolean employeeRecords = true;// for looping do while loop to add multiple recordsss
		int employeeID = 0; // create employee code variable
		String employeeName = ""; // create employee name variable
		int getEnteredValue = 0; // create getEnteredValue variable to insert/display employee data

		Scanner scan = new Scanner(System.in); // initialize scanner class object
		// loop while user wants to enter multiple records
		while (employeeRecords) {
			System.out.println("\n1:Insert Employee\t\t2:Display Employee Data\t\t3:Exit from Application");
			// requesting for user selection input
			getEnteredValue = scan.nextInt();

			if (getEnteredValue == 1) { // condition check if user entered 1 to insert employee data
				System.out.print("Enter Employee ID number:\n");
				employeeID = scan.nextInt();
				// ask for user input which corresponds to Employee name
				System.out.print("Enter Employee Name:\n");
				scan.nextLine();
				employeeName = scan.nextLine();
				// add the key value pair from user input to the employeedetails hashmap
				employeeDetails.put(employeeID, employeeName);
				System.out.println("Data Added Successfully!!!!!");
			}

			if (getEnteredValue == 2) { // if user enter 2 it'll display entered employee data
				System.out.println(".......................................................................");
				System.out.println("Below are the Employee's name Entered\n");
				System.out.println("Employee Name");
				System.out.println("--------------");
				for (int id : employeeDetails.keySet()) { // for loop tp get the employee details from employeedetails
															// hashmap
					System.out.println(" " + employeeDetails.get(id)); // displays employee name based on the employee
																		// id.
				}
			}

			if (getEnteredValue == 3) { // if user entered 3, then it'll break the execution and exit from the main
										// method
				break;
			}
		}
		scan.close(); // closes the scanner object
	}
}