package SampleProject;

// An interface in Java is a blueprint of a class. 
// interface has static constants and abstract methods.
// It is used to achieve abstraction and multiple inheritance in Java.

interface government {  // Here we created interface with simple method and abstract method
	public abstract void ApprovalProcess();
}

interface Bank_Interface extends government{ // to inherit interface "extends" keyword is used.
	public abstract float RateOfInterest();
	public float LoanCommission();
}

class SBI_Interface implements Bank_Interface{ // Classes implemented by interfaces
	
	public float RateOfInterest() {
		return 8.9f;
	}

	@Override
	public float LoanCommission() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ApprovalProcess() {
		// TODO Auto-generated method stub
		
	}
}

class HDFC_Interface implements Bank_Interface{
	public float RateOfInterest() {
		return 10.5f;
	}

	@Override
	public float LoanCommission() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ApprovalProcess() {
		// TODO Auto-generated method stub
		
	}
}

public class SampleInterface{
	public static void main(String[] args) {
	Bank_Interface bi = new SBI_Interface();
	Bank_Interface hdfc = new HDFC_Interface();
	System.out.println("Rate of interest of SBI is  : "+bi.RateOfInterest());
	System.out.println("Rate of interest of HDFC is : "+hdfc.RateOfInterest());
	}
}