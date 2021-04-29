package AnotherEmployee;

abstract public class StaffMember{
	protected String name;
	protected String address;
	protected String phone;

	public StaffMember (String eName, String eAddress, String ePhone){
		name = eName;
		address = eAddress;
		phone = ePhone;
	}

	public String toString(){
		String result = "Name: " + name ;
	    result += "\nAddress: " + address ;
	    result += "\nPhone: " + phone;

	    return result;
	}

	 public abstract double pay();
}

