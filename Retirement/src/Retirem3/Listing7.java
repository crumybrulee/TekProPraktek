package Retirem3;

import java.util.*;

/**
 * Program ini mendemonstrasikan manipulasi array
 * dengan LotteryDrawing
 * @version 1.20 2004-02-10
 * @author Cay Horstmann
 */
public class Listing7
{
public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);

        System.out.print("Berapa banyak angka yang perlu Anda gambar? ");
        int k = in.nextInt();

        System.out.print("Berapa angka tertinggi yang bisa Anda gambar? ");
        int n = in.nextInt();

        // isi array dengan angka 1 2 3. . . n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
           numbers[i] = i + 1;

        //gambar k angka dan letakkan ke dalam larik kedua
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
           // buat indeks acak antara 0 dan n - 1
           int r = (int) (Math.random() * n);
           
           // buat elemen terakhir di lokasi acak
           result[i] = numbers[r];

           // pindahkan elemen terakhir ke lokasi acak
           numbers[r] = numbers[n - 1];
           n--;
        }

        // mencetak array yang diurutkan
        Arrays.sort(result);
        System.out.println("Taruhan kombinasi berikut. Itu akan membuatmu kaya!13");
        for (int r : result)
           System.out.println(r);
     }
}                                                       