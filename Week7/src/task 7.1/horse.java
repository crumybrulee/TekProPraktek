package task1;

public class horse extends animal {
	
	@Override
	public void sound(){
		System.out.println("Neigh");
	}
	public static void main(String args[]){
		animal obj = new horse();
		obj.sound();
	}
}
