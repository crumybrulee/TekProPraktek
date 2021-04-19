package Listing467;

import static java.lang.System.out;

/*
 * Program ini mendemonstrasikan penggunaan packages
 */
public class PackageTest {
	public static void main(String[] args){
		//krn pernyataan import, tidak harus menggunakan 
		//com.horstmann.core java.Employee di package sini
	Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
	
	harry.raiseSalary(5);
	//krn pernyataan imports, tidak harus menggunakan System.out disini
	out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
	}
}