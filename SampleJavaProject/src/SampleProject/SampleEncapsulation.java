package SampleProject;

// Encapsulation in Java is a process of wrapping code and data together into a single unit.
// Encapsulation can be achieved by getter and setter methods.


public class SampleEncapsulation {
	
	private String StudentName;
	private int Marks;
	
	public String SetName(String Sname) {  // Here we assign string value to "StudentName" variable.
		return this.StudentName = Sname;
	}
	
	public int SetMarks(int M) { // Here we assign integer value to "Marks" variable.
		return this.Marks = M;
	}
	
	public String GetName() { // Here we get assigned value from String variable "StudentName".
		return StudentName;
	}
	
	public int GetMarks() { // Here we get assigned value from String variable "Marks".
		return Marks;
	}
	
	public String GetResult() {
		if(Marks < 35) {
			return "failed";
		}
		else {
			return "pass";
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleEncapsulation s = new SampleEncapsulation(); // Created the object of SampleEncapsulation class
		s.SetName("ganesh"); // Set the value by calling "SetName" method.
		s.SetMarks(35); // Set the value by calling "SetMarks" method.
		System.out.print("The student name is "+s.GetName()+" and his marks are"+s.GetMarks()+" so he is "+s.GetResult()+" in the exam");

	}

}
