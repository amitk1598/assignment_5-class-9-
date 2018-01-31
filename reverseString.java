package acadview_assignment_5;

import java.util.Scanner;

public class reverseString {
	 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PRINT A STRING - ");
		String str = sc.nextLine();

	StringBuffer s= new StringBuffer(str);
	System.out.println(s.reverse());
	}
}
