import java.util.*;

class Main{
	
	public static void main (String args[]){
		
		Scanner cin = new Scanner(System.in);
		
		int dataset = cin.nextInt();
		
		for (int i=0; i < dataset; i++){
			
			int numbering = cin.nextInt();
			
			int n = cin.nextInt();
			
			int maxn = 1;
			//n is even
			while (n!=1){
				if (n > maxn){
					maxn = n;
				}
				if ((n%2) == 0){
					n = n/2;
				}
			
				//n is odd
				else if ((n%2) == 1){
					n = (n*3)+1;
				}

			}
			System.out.println(numbering +" "+maxn );
			
		}
		
	}
	
}

