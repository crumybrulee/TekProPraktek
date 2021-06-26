package Week11;
/*
 * CountLetters.java
 * Membaca kata dari input standar dan mencetak jumlah
 * kemunculan setiap huruf dalam kata itu.
 */
import java.util.Scanner;
public class CountLetters{
	public static void main(String[] args){ 
		int[] counts = new int[26];
		Scanner scan = new Scanner(System.in);
		
		//mendapatkan kabar dari pengguna
		System.out.print("Enter a single word (letters only, please): "); 
		String word = scan.nextLine();

		//konversi ke semua huruf besar kata = 
		word.toUpperCase();
		
		//hitung frekuensi setiap huruf dalam string
		for (int i=0; i < word.length(); i++){
			//menambahkan try - catch
			//body catch tidak diubah apapun
			try{
				counts[word.charAt(i)-'A']++;
			} catch (ArrayIndexOutOfBoundsException e){
				System.out.println(word.charAt(i)+ " is not a letter");
			}
		}
			
		
		//print frequencies 
		System.out.println();
		for (int i=0; i < counts.length; i++){
			if (counts [i] != 0){
				System.out.println((char)(i +'A') + ": " + counts[i]);
			}
		}
	}
}
