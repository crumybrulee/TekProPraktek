package Listing45;

import java.util.Random;

class Employee {
	private static int nextId;
	
	private int id;
	private String name = ""; // contoh inisialisai
	private double salary;
	
	//blok inisialisasi statis
	static{
		Random generator = new Random();
		//atur nextId untuk nomor acak antara 0 - 9999
		nextId = generator.nextInt(10000);
	}
	//inisialisasi blok objek
	{
		id = nextId;
		nextId++;
	}
	//tiga konstruktor overloaded
	public Employee(String n, double s){
		name = n;
		salary = s;
		}
	
	public Employee(double s){
		//panggil parameter konstruktor Employee(String, double)
		this("Employee #" + nextId, s);
	}
	//default konstruktor
	public Employee(){
		// nama diinisialisasi menjadi "" --lihat di atas
		// gaji tidak ditetapkan secara eksplisit - diinisialisasi ke 0
		// id diinisialisasi dalam blok inisialisasi
	}
	
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public int getId(){
		return id;
	}
}
