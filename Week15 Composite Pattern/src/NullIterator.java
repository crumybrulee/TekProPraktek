package Composite.src;
import java.util.Iterator;

public class NullIterator implements Iterator{
	//When next() is called, we return null
	public Object next(){
		return null;
	}

	//Most importantly when hasNext() is called we always return false.
	public boolean hasNext() {
		return false;
	}
	
	//And the NullIterator wouldn’t think of supporting remove.
	public void remove() {
		throw new UnsupportedOperationException();
	}
}

/*Pikirkan seperti ini: MenuItem tidak ada yang perlu diulang 
kita punya dua pilihan:
Plihan 1 : Kembalikan nol
Kita bisa mengembalikan null dari createIterator(), tapi kemudian kita akan
perlu kode bersyarat di klien untuk melihat apakah nol itudikembalikan atau tidak.

Pilihan 2 : Kembalikan iterator yang selalu mengembalikan false saat hasNext() dipanggil
Ini sepertinya rencana yang lebih baik. Kami masih bisa mengembalikan iterator, tapi
klien tidak perlu khawatir tentang apakah null pernah ada atau tidak
dikembalikan. Akibatnya, kami membuat iterator yang "tidak ada operasi".
 */
