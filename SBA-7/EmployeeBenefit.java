/*5. Write a program to input the following details:
i)Employee Name
ii)Employee Salary
iii)Employee Year of joining
 
Calculate the Loyalty bonus of the Employee's by
a)if the year of their joining is on or before than 2017,and their Salary is more than 30000/-,
then the bonus will be 22% of the salary.
b)if the year of their joining is on or before than 2017,and their Salary is less than 30000/-,
then the bonus will be 33% of the salary.
c)if the year of their joining is on or before than 2012,
then the bonus will be 40% of the salary.
d)if the year of their joining is after 2017,and their Salary is less than 30000/-,
then the bonus will be 15% of the salary.
e)if the year of their joining is after 2017,and their Salary is more than 30000/-,
then the bonus will be 10% of the salary.*/



package SBA7;

import java.util.Scanner;

public class EmployeeBenefit {
	public static void main(String[] args) {
		System.out.println("Enter the name of Employee; ");
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		System.out.println("Enter the salary of the Employee: ");
		int salary = sc.nextInt();
		System.out.println("Enter the year of joining of the Employee: ");
		int year=sc.nextInt();
		if((year<=2017) && (salary>30000)) {
			if(year<=2012) {
				float bonus = ((40*salary/100));
				System.out.println("Bonus will be: "+bonus);
			}else {
				float bonus = ((22*salary/100));
				System.out.println("Bonus will be: "+bonus);
			}
		}
		if((year<=2017) && (salary<30000)) {
			if(year<=2012) {
				float bonus = (40*salary/100);
				System.out.println("Bonus will be: "+bonus);
			}else {
				float bonus = (33*salary/100);
				System.out.println("Bonus will be: "+bonus);
			}
		}
		if((year>=2017) && (salary>30000)) {
			if(year<=2012) {
				float bonus = (10*salary/100);
				System.out.println("Bonus will be: "+bonus);
			}
		}
		
		
	}
	

}
