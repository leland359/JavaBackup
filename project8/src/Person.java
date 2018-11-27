
public class Person {
	private String name;
	private String address;
	
	
	public Person () {
		this.name = " ";
		this.address = " "; 
	}
	
	public Person (String name, String address) {
		this.name = name;
		this.address = address; 
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() { 
		return this.address;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAddress(String newAdress){
		this.address = newAdress;
	}
	
	public String toString(){
		String personalDetails = "Name: " + this.name.toString() + "\nAddress: " + this.address.toString();
		return personalDetails;
	}
}
