package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class WritingAndReadingFromAFile {

	public static void main(String[] args) {
		
		String fileName = "src/exception/Hello.txt";
		
		try{
			
			PrintWriter pw = new PrintWriter(fileName);
			pw.println("Hello");
			pw.println("src/exception/ to put file in this folder otherwise it goes to the root folder"
					+ " which in this case is ExerciseSolution");
			pw.println("");
			
			pw.flush();
			pw.close();
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "File could not be found");
		
		
		}
		try{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			
			br.close();
			
	
		}catch(IOException io){
			JOptionPane.showMessageDialog(null, "Can't read from file");
		}
		System.out.println("End of Main");
	}
}
