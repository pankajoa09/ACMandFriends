import java.util.*;

class Main{
	
	public static void main(String args[]){
		
		Scanner cin = new Scanner(System.in);
		
		int caseNumber = 0;
		while (cin.hasNextInt()){
		
		
			
		caseNumber++;
		int n = cin.nextInt(); //number of items in the list to be queried
		
		
		
		if (n==0){
			break;
		}
		
		List<Integer> nnumberList = new ArrayList<Integer>(); //the list
				
		for (int i=0;i < n;i++){
			int nnumber = cin.nextInt();
			nnumberList.add(nnumber);//adding them to the list
			
		}
		
		
		int m = cin.nextInt();//the number of items being queried
				
		
		System.out.println("Case "+caseNumber+":");		
		for (int s=0; s < m; s++){
			
			int mnumber = cin.nextInt(); //inputting the items
			
			
			//going through once at n^2 to find the smallest Distance possible, closest combination
			int minDistance = 1000000000; //maybe ill change it later if it fails some test cases
			for (Integer a : nnumberList){
				for (Integer b: nnumberList){
					int Distance = Math.abs(mnumber-(a+b));
					
					if (a != b){
						// updating the minDistance
						if (Distance < minDistance){
//							System.out.println(a+"+"+b+"= "+(a+b));
							minDistance = Distance;
						}
					}
						
				}	
			}
			int combA = 0;
			int combB = 0;
			for (Integer a : nnumberList){
				for (Integer b: nnumberList){
					int Distance = Math.abs(mnumber-(a+b));
					
					if (a != b){
						// updating the minDistance
						if (Distance == minDistance){
//							System.out.println(a+"+"+b+"= "+(a+b));
							combA = a;
							combB = b;
						}
					}
						
				}	
			}
			System.out.println("Closest sum to "+mnumber+" is "+(combA+combB)+".");
			
		}
				
		
	}
}
}

