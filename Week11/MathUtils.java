package Week11;
/*
 * MathUtils.java
 * Menyediakan fungsi utilitas matematika statis.
 */
public class MathUtils {
	public static int factorial(int n) throws IllegalArgumentException{
		//Menampilkan pesan untuk inputan angka negatif
		if(n<0){
			throw new IllegalArgumentException("Factorial for undefined negative numbers");
		}
		//Menampilkan pesan untuk inputan angka>16
		if(n>16){
			throw new IllegalArgumentException("Arithmatetic Overflow");
		}
		int fac = 1;
		for (int i = n; i>0; i--)
			fac *= i;
		return fac;
	}
}
