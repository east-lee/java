package section01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {
	
	static Person1 [] members;
	static int n = 0;
	
	public static void main(String[] args) {
		members = new Person1 [100];
		try {
			Scanner in = new Scanner(new File("input.txt"));
			
			while (in.hasNext()) {
				String name = in.next();
				String number = in.next();
				
				members[n] = new Person1();
				
				members[n].name = name;
				members[n].number = number;
				
				n ++;							
			}
			
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(members[i].name + " " + members[i].number);
		}
		

	}

}
