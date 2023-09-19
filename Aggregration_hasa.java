package program;

class Address{
	String city,state,country;

	public Address(String city, String state, String country) {
		
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
}

class Employes{
	int id;
	String name;
	Address address;   //is a refernce 
	public Employes(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void display() {
		System.out.println("Employe Id: "+this.id+"\nEmploye Name: "+this.name);
		System.out.println("City is: "+address.city+"\nState is: "+address.state+" \ncountry is: "+address.country);
		System.out.println();
	}
}

public class Aggregration_hasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad=new Address("Mumbai","Maharastra","India");
		Address ad1=new Address("Banglore","Karnataka","India");
		Address ad2=new Address("Jaipur","Rajeshtan","India");
		
		Employes e = new Employes(1,"Nayan",ad);
		Employes e1 = new Employes(2,"Satyam",ad1);
		Employes e2 = new Employes(3,"Mukesh",ad2);
		e.display();
		e1.display();
		e2.display();
		
	}

}