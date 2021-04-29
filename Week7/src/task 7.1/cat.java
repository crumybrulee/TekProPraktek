package task1;

public class cat extends animal {
	
	@Override
	public void sound(){
		System.out.println("Meow");
	}
	public static void main(String[] args){
		animal obj = new cat();
		obj.sound();
	}
}
