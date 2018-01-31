package acadview_assignment_5;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("ENTER STRING - ");
	String str = sc.next();
	
 String st  =	str.replaceAll("[aeiou]"," *");
 System.out.println(st);
	
	}

}
