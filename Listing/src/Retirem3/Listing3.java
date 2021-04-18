package Retirem3;

import java.util.*;
/**
   * Program ini mendemonstrasikan perulangan <code> while </code>.
   * @version 1.20 2004-02-10
   * @author Cay Horstmann
   */
  public class Listing3
  {
     public static void main(String[] args)
     {
        // membaca input
        Scanner in = new Scanner(System.in);

        System.out.print("Berapa banyak uang yang Anda butuhkan untuk pensiun? ");
        double goal = in.nextDouble();

        System.out.print("Berapa banyak uang yang akan Anda kontribusikan setiap tahun? ");
        double payment = in.nextDouble();

        System.out.print("Suku bunga dalam % : ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        // memperbarui saldo akun saat tujuan tidak tercapai
        while (balance < goal)
        {
           //tambahkan pembayaran dan bunga tahun ini
           balance += payment;
           double interest = balance * interestRate / 100;
           balance += interest;
           years++;
        }

        System.out.println("Anda bisa pensiun " + years + " tahun.");
     }
  }                                                   
