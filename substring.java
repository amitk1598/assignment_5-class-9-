package acadview_assignment_5;

public class substring {

	public static void main(String[] args) {
		
		String str = "amit";
		
		for(int a=0; a<=str.length()-1;a++){
		
			for(int j=a+1;j<=str.length();j++){
				System.out.println(str.substring(a,j));
			}
		}
	}

	}

