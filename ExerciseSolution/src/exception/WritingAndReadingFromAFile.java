package exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class WritingAndReadingFromAFile {

	public static void main(String[] args) {
		
		
		
		try{
			
			PrintWriter pw = new PrintWriter("Hello.txt");
			pw.println("Hello");
			pw.flush();
			pw.close();
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "File could not be found");
		
		
		}
		
	
		System.out.println("End of Main");
	}
}
