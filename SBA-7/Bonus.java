/*4.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount. 
Note- create a method Employee Bonus to calculate the bonus and return it.*/


package SBA7;

import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		EmployeeBonus();
	}
	public static void EmployeeBonus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Experiance: ");
		int x= sc.nextInt();
		System.out.println("Enter Employee Salary: ");
		int y=sc.nextInt();
		if(x>5) {
			double result = (double)y+y*0.05;
			System.out.println("Eligible for Bonus."+result);
			
		}else {
			System.out.println("Not Eligible for Bonus.");
			
		}
		
		
	}

}