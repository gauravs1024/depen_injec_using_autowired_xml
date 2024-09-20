package bean;



public class Address {
	private String city;
	private int houseno;
	private int pincode;

	public Address(String city,int houseno,int pincode) {
		this.houseno=houseno;
		this.pincode=pincode;
		this.city=city;

		
	}
	
	@Override
	public String toString() {
		return "#"+houseno+","+city+","+pincode;
	}


}
