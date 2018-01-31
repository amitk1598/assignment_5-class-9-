package acadview_assignment_5;

import java.util.Scanner;

public class pattern {
	 public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		// System.out.println("ENTER STRING ");
		 String str = "ABC";
		
		 
		 for (int i=0;i<=str.length();i++){
			
			 for(int j=1;j<=str.length()&&j>i;j++) {
	                System.out.println(str.substring(i, j));		

			}
			
	
			 
		 }
	}

}
