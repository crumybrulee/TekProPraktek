package Listing45;
import java.util.*;
/*
 * Program untuk mendemonstrasikan sebuah konstruktor objek
 */
public class ConstructorTest {
	public static void main(String[] args){
		//isi array staf dengan tiga objek Karyawan
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		//menampilkan informasi ttg semua objek Employee
		for (Employee e : staff)
			System.out.println("name=" + e.getName()+",id=" + e.getId()+",salary="+e.getSalary());
	}
}
