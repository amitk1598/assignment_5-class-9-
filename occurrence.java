package acadview_assignment_5;

import java.util.Scanner;

public class occurrence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string 1 - ");
		String str1 = sc.next();

		System.out.println("enter string  - ");
		String str2 = sc.next();
		
		if(str1.contains(str2)){
			System.out.println("present");
		}
		else{System.out.println("absent");}
	}
}
