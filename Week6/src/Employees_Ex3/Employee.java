package Employees;

class Employee extends Sortable {
	
	public Employee(String n, double s, int day, int month, int year){
		name = n;
		salary = s; 
		 hireday = day;
		 hiremonth = month;
		 hireyear = year;
	}
	
	public void print(){
		//beda hireYear() jadi hireYear aja
		System.out.println(name + " " + salary + " " + hireYear());
	}
	
	public void raiseSalary(double byPercent){
		salary *= 1 + byPercent / 100;
	}
	
	public int hireYear(){
		return hireyear;
	}
	
	//deklarasi variable
	private String name;
	private double salary;
	//diubah jadi public
	public int hireday;
	public int hiremonth;
	private int hireyear;
	
	@Override //case 1 Task 3.1
	public int compare(Sortable b) {
		Employee eb = (Employee) b;
		 if (salary<eb.salary) return -1;
		 if (salary>eb.salary) return +1;
		return 0;
	}
	
}
