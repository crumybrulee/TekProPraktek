package Composite.src;
import java.util.*;

public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
	
	//iterator posisi top level composite
	//memasukkan data kedalam stack(tumpukan)
	public CompositeIterator(Iterator iterator) {
	stack.push(iterator);
	}
	
	public Object next() {
		if (hasNext()) { 
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu) {
				stack.push(component.iterator());
			} return component;
			} else {
				return null;
		}
	}
	
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
	
	//We’re not supporting remove, just traversal.
	public void remove(){
		throw new UnsupportedOperationException();
	}
}

/*Saat kita menulis metode print() di
Kelas MenuComponent kami menggunakan iterator untuk
langkah melalui setiap item dalam komponen dan jika
item itu adalah Menu (bukan MenuItem),
kemudian kita secara rekursif memanggil metode print() untuk
tangani itu. Dengan kata lain, MenuComponent
menangani iterasi itu sendiri, secara internal.
Dengan kode ini kami mengimplementasikan eksternal
iterator sehingga ada lebih banyak untuk dilacak.
Sebagai permulaan, iterator eksternal harus mempertahankan
posisi dalam iterasi sehingga klien luar
dapat mendorong iterasi dengan memanggil hasNext() dan
Selanjutnya(). Tetapi dalam hal ini, kode kita juga perlu
mempertahankan posisi itu di atas komposit, rekursif
struktur. Itu sebabnya kami menggunakan tumpukan untuk memelihara
posisi kita saat kita bergerak naik dan turun
hierarki komposit.*/
