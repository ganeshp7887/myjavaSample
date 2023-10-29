package SampleProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SampleFileOperations {
	
	private static File f;
	private static FileWriter fw;
	private static Scanner sc;
	public static void CreateFile(String Filename) {
		f = new File(Filename);
		try {
			if(f.createNewFile()) { System.out.println(Filename+" file created successfully");  }
			else { System.out.println("File is already exist in the directory."); }
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	public static void ReadFromFile(String Filename) {
		f = new File(Filename);
		try {
			sc = new Scanner(f);
			while(sc.hasNextLine()) {
				System.out.print(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void WriteIntoFile(String Filename, String Text) {
		try {
			fw = new FileWriter(Filename);
			fw.write(Text);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void DeleteFile(String Filename){
		f = new File(Filename);
		if(f.exists()) {
			f.delete();
			System.out.println(Filename+" file deleted successfully");
		} else {
			System.out.println("file not found");
		}
		} 
	
	public static void main(String[] args) {
		String Filename = "D://ganesh.txt";
		DeleteFile(Filename);
		CreateFile(Filename);
		WriteIntoFile(Filename, "ganesh is good boy");
		ReadFromFile(Filename);
	}
}
