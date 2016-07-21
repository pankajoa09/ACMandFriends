import java.math.BigDecimal;
import java.util.*;

class Main{
	
	public static void main (String args[]){
		
		Scanner cin = new Scanner(System.in);
		

		
		while (cin.hasNext()){
			
			BigDecimal R = cin.nextBigDecimal();
			
			int n = cin.nextInt();
			
			String ans = R.pow(n).stripTrailingZeros().toPlainString();
			
			if (ans.contains(".")){
				if (ans.substring(0,2).equals("0.")){
			
					ans = ans.substring(1,ans.length());
				}}
			
			System.out.println(ans);
			
		}
		
	}
	
	
}
