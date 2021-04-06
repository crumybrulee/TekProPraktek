package Retirem3;

/**
 * Program ini menunjukkan bagaimana menyimpan data tabular dalam array 2D.
 * dengan class Bunga Majemuk
 * @author Lenovo
 * @version 1.20
 */
public class Listing8 {
	public static void main(String[] args)
	{
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		
		//tetapkan suku bunga menjadi 10. . . 15%
		double[] interestRate = new double[NRATES];
		for (int j = 0; j < interestRate.length; j++)
			interestRate[j] = (STARTRATE + j)/ 100.0;
		
		double[][] balances = new double [NYEARS][NRATES];
		
		//setel saldo awal menjadi 10.000
		for (int j = 0; j<balances[0].length;j++)
			balances[0][j] = 10000;
		
		//menghitung bunga untuk tahun-tahun mendatang
		for (int i =1; i<balances.length; i++)
		{ 
			for (int j=0; j<balances[i].length;j++)
			{
				//dapatkan saldo tahun lalu dari baris sebelumnya
				double oldBalance = balances[i-1][j];
				//menghitung bunga
				double interest = oldBalance*interestRate[j];
				//menghitung saldo tahun ini
				balances[i][j] = oldBalance + interest;
			}
		}
		// cetak satu baris suku bunga
		for (int j=0; j<interestRate.length;j++)
			System.out.printf("%9.0f%%", 100 * interestRate[j]);
		System.out.println();
		
		//cetak meja neraca
		for (double[] row : balances)
		{ //baris tabel cetak
			for (double b : row)
				System.out.printf("%10.2f", b);
			System.out.println();
		}
	}
}
