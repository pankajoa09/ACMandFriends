import java.util.*;

class Main{
	
	public static void main (String args[]){
		Scanner cin = new Scanner(System.in);
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		while (cin.hasNextInt()){
			
			int n = cin.nextInt();
			
			numberList.add(n);
			
			Collections.sort(numberList);
			
			
			//figure out where to split
			int split = 0;
			int median = 0;
			
			
			if ((numberList.size()%2) == 0){
				split = (numberList.size()/2)-1;
//				System.out.println("split: even "+split+" "+(split+1));
				median = (numberList.get(split)+numberList.get(split+1))/2;
				
			}
			
			else if (numberList.size()%2 == 1){
				split = (int) (numberList.size()/2);
//				System.out.println("split: odd "+split);
				median = numberList.get(split);
			}
			
			System.out.println(median);
			
			
			
			
		}
		
		
		
		
	}
	
	
	
}
