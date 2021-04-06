package Retirem3;

import java.math.*;
import java.util.*;

/**
 * Program ini menggunakan angka besar untuk menghitung peluang 
 * memenangkan hadiah utama dalam lotre dengan menggunakan
 * BigIntegerTest
 * @author Lenovo's Crumybrulee
 * @version 1.20
 */
public class Listing6 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Berapa banyak angka yang perlu Anda gambar?");
		int k = in.nextInt();
		
		System.out.print("Berapa angka tertinggi yang bisa Anda gambar?");
		int n = in.nextInt();
		
		/*
		 * hitung koefisien binomial n*(n-1)*(n-2) *...*(n-k + 1)/(1*2*3*...*k)
		 */
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		
		for (int i = 1; i<= k; i++)
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
		
		System.out.println("Peluang Anda adalah 1 dalam "+ lotteryOdds +". Semoga berhasil");
	}
}
