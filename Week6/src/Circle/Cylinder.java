package Circle;

public class Cylinder extends Circle {
	private double height;	// private variable

	// Constructor default
	public Cylinder(){
		super();
		height = 1.0;
	}
	
	//contructor default dg parameter height
	public Cylinder(double height){
		super();
		this.height = height;
	}
	//constructor default dg parameter radius dan height
	public Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}
	
	//Public method Getter untuk height
	public double getHeight(){
		return height;
	}
	
	//Public method Getter untuk volume
	//menggunakan method superclass getArea untuk mendapatkan area
	//diubah daari getArea jadi super.getArea DONE
	public double getVolume(){
		return super.getArea()*height;
	}
	
	@Override 
	//task 1.2 DONE
	public double getArea(){
		//LP (= 2phi × jari-jari × tinggi + 2 × luas alas)
		return 2*Math.PI*getRadius()*height + 2* super.getArea();
	}
	
	 @Override
	    //acuan task 1.3 DONE
	    public String toString() {
	        return "Cylinder: subclass of " + super.toString()
	             + " height=" + height;
	    }

}
