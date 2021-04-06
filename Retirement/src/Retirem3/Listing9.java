package Retirem3;


/**
 * Program ini mendemonstrasikan array segitiga.
 * @author Lenovo
 * @version 1.20
 */
public class Listing9 
{
	public static void main(String[] args)
	{
		final int NMAX = 10;
		
		//alokasikan array segitiga
		int[][] odds = new int [NMAX+1][];
		for(int n = 0; n<= NMAX; n++)
			odds[n] = new int[n+1];
		
		//mengisi array segitiga
		for (int n = 0; n < odds.length; n++)
			for(int k = 0; k < odds[n].length; k++)
			{
				//hitung koefisien binomial n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
				int lotteryOdds = 1;
				for (int i=1; i<=k; i++)
					lotteryOdds = lotteryOdds*(n-i+1)/i;
				odds[n][k] = lotteryOdds;
			}
		// tampilkan array segitiga
		for (int[] row : odds)
		{
			for (int odd : row)
				System.out.printf("%4d", odd);
			System.out.println();
			}
	}
}
