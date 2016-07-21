import java.util.*;

class Main{
	
	public static void main(String args[]){
		
		Scanner cin = new Scanner(System.in);
		int cases = cin.nextInt();
		
		for (int i=1;i<=cases;i++){
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			
			if ((a-b)*(c-a) >= 0){
				System.out.println("Case "+i+": "+a);
			}
			else if ((b-a)*(c-b) >= 0){
				System.out.println("Case "+i+": "+b);
			}
			else{ System.out.println("Case "+i+": "+c);}
			
			
		}
		
		
		
	}
	
	
	
}
