class Lagu {
	private String namaPenyanyi;
	public String getNamaPenyanyi() {
		return namaPenyanyi;
	}
	public void setNamaPenyanyi(String namaPenyanyi) {
		this.namaPenyanyi = namaPenyanyi;
	}
	public String getJudulLagu() {
		return judulLagu;
	}
	public void setJudulLagu(String judulLagu) {
		this.judulLagu = judulLagu;
	}
	public int getTahunRilis() {
		return tahunRilis;
	}
	public void setTahunRilis (int tahunRilis) {
		this.tahunRilis = tahunRilis;
	}

	private String judulLagu;
	private int tahunRilis;
	
	//Data untuk Nama Penyanyi Solo
	void aturNama (String namaPenyanyi){
		this.namaPenyanyi = namaPenyanyi;
	} String dapatNamaPenyanyi(){
		return namaPenyanyi;
	}
	
	//Data untuk Judul Lagu
	void aturJenis (String judulLagu){
		this.judulLagu = judulLagu;
	} String dapatJudulLagu(){
		return judulLagu;
	}
	
	//Data untuk Tahun Rilisnya Lagu 
	void aturTahunRilis (int tahunRilis){
		this.tahunRilis = tahunRilis;
	} int dapatTahunRilis(){
		return tahunRilis;
	}
	
	//Menampilkan hasil informasi
	void InformasiLagu (){
		System.out.println();
			System.out.println("Nama Penyanyi :"
					+ namaPenyanyi);
			System.out.println("Judul Lagu :"
					+ judulLagu);
			System.out.println("Tahun Rilis :"
					+ tahunRilis);
			System.out.println("==================================================");
	}
		
	}
