package Retirem3;
import java.util.*;
/**
 * Program ini mendemonstrasikan input konsol.
 * @author Lenovo
 * @version 1.10
 */
public class Listing2 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// masukan input pertama
		System.out.print("Siapa nama kamu? ");
		String name = in.nextLine();
		// masukan input kedua
		System.out.print("Berapa umur kamu? ");
		int age = in.nextInt();
		
		//menampilkan output keseluruhan
		System.out.println("Annyeong, " + name + ". Tahun depan kamu akan berumur " + (age + 1));
	}
}
