package Employees;

public class Employee {
	
	public Employee(String n, double s, int day, int month, int year){
	name = n;
	salary = s; 
	hireDay = day; 
	hireMonth = month; 
	hireYear = year;
	}
	
	public void print(){
		//beda hireYear() jadi hireYear aja
		System.out.println(name + " " + salary + " " + hireYear());
	}
	
	public void raiseSalary(double byPercent){
		salary *= 1 + byPercent / 100;
	}
	
	public int hireYear(){
		return hireYear;
	}
	
	//deklarasi variable
	private String name;
	private double salary;
	private int hireDay;
	private int hireMonth;
	private int hireYear;
	
}
