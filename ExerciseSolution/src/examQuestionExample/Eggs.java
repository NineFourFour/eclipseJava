package examQuestionExample;

import java.util.ArrayList;
import java.util.Arrays;

public class Eggs {

	
	public static void main(String[] z) {
		
		
		Dozens [] da = new Dozens[3];
		da[0] = new Dozens();
		da[1] = new Dozens();
		da[2] = new Dozens();
		//System.out.println(da[0].dz.length);
		for(int i=0; i< da.length; i++){
			System.out.println("\n");
			for(int j=0; j< da[i].dz.length; j++)
				System.out.print(da[i].dz[j]);
		}
		Dozens d = new Dozens();
		int j = d.dz[0];
		System.out.println(d.dz[6]);
		
		
		String b = new String("cheese");
		String c = "swiss";
		b = c;
	
		
		
	}
}
