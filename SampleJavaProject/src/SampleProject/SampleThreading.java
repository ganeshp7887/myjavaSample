package SampleProject;

class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 10; i++) {
			System.out.println("Threading of 1 "+i);
		}
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println("Exception as "+e.getMessage());
		}	
	}
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println("Threading of 2 "+i);
		}
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println("Exception as "+e.getMessage());
		}	
		
	}
	
}

public class SampleThreading{
	
	public static void main(String[] args) {
		Runnable r1 = new Thread1();
		Runnable r2 = new Thread2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}