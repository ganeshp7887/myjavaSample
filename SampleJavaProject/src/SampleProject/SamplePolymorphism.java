package SampleProject;

//Polymorphism is a concept by which we can perform a single action in different ways. 
//here method is adapted by two more class this is how polymorphism works


//Example of runtime polymorphism

class Bank{
	
	public float RateofInterest() {
		return 1.0f;
	}
	
}

class SBI extends Bank{
	
	public float RateofInterest() {
		// TODO Auto-generated method stub
		return 8.8f;
	}
} 

class HDFC extends Bank{
	
	public float RateofInterest() {
		return 10.9f;
	}
}

class BOM extends Bank{
	
	public float RateofInterest() {
		return 11.60f;
	}
}


public class SamplePolymorphism{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello welcome to banking");		
		Bank b = new Bank();
		Bank ss = new SBI(); // upcasting is in work here as sbi class is declared as bank class
		Bank h = new HDFC(); // upcasting is in work here as hdfc class is declared as bank class
		Bank bom = new BOM(); // upcasting is in work here as bom class is declared as bank class
		System.out.println("The bydefault rate of insterest of bank is "+b.RateofInterest());
		System.out.println("Rate of interest of SBI is  : "+ss.RateofInterest());
		System.out.println("Rate of interest of HDFC is : "+h.RateofInterest());
		System.out.println("Rate of interest of BOM is : "+bom.RateofInterest());
		
	}

}
