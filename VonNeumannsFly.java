import java.util.*;

class Main{
	
	public static void main(String args[]){
		
		
		
		Scanner cin = new Scanner(System.in);
		int testCases = cin.nextInt();
		
		for (int i = 0; i < testCases; i++){	
	
		int testCase = cin.nextInt();
		
		float distance = cin.nextFloat();
		float Aspeed = cin.nextFloat();
		float Bspeed = cin.nextFloat();
		float Fspeed = cin.nextFloat();
		
		float time = distance/(Aspeed+Bspeed);
		float Fdistance = time*Fspeed;
		
		//float ans = (float)Math.round(Fdistance * 100) / 100;
		
		System.out.println(testCase+ " "+String.format("%.2f",Fdistance));
		
		}
		
	}
	
	
}

