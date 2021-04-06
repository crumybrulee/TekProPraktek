public class InformasiLagu {
	public static void main(String[] args){
		//Objek
		Lagu Lagu1 = new Lagu();
		Lagu Lagu2 = new Lagu();
		
		//Data untuk Lagu 1
		Lagu1.aturNama("Roseana Park");
		Lagu1.setJudulLagu("On The Ground dan Gone");
		Lagu1.aturTahunRilis(2021);
		
		//Data untuk Lagu 2
		Lagu2.aturNama("Jennie Kim");
		Lagu2.setJudulLagu("Solo");
		Lagu2.aturTahunRilis(2018);
		
		//Data dari kedua objek
		System.out.println("Penyanyi Lagu Gone adalah "
				+ Lagu1.dapatNamaPenyanyi());
		System.out.println("Penyanyi Lagu Solo adalah "
				+ Lagu2.dapatNamaPenyanyi());
		
		//Menampilkan data dari keseluruhan
		Lagu1.InformasiLagu();
		Lagu2.InformasiLagu();
		
	}
}
