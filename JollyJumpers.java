import java.util.*;

class Main {
        public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		
//		while (cin.hasNextLine()){
//			int n = cin.nextInt();
//			for (int i=0;i<n;i++){
//				int curr = cin.nextInt();
//				// do something
//			}
//			
//			// write code here
//			// your mom's a whore
//			
//		}
		
	while (cin.hasNextLine()){
		
		//parsing the string
		String givenString = cin.nextLine();
		String[] thenumbers = givenString.split("\\s+");
		int numberOfInputs = Integer.parseInt(thenumbers[0]);
//		System.out.println("numberOfInputs : " + numberOfInputs);
		

    	//to collect the numbers		
		List<Integer> basket1 = new ArrayList<Integer>();
		
		
		//Jolly Not Jolly
		boolean pj = true;
		
		int temp = 0; //engine
		
		// go through the remaining numbers
        for (int h = 1; h <= numberOfInputs; h++){
        	
        	if (h > numberOfInputs){break;}
     
        	//go through the subsequent digits
        	int n = Integer.parseInt(thenumbers[h]);
        	        		
        	if (n-temp==0){  
       			pj = false;}
        	
//        	System.out.println("The function: "+n+"-"+temp+"="+Math.abs(n-temp));
        	
       		basket1.add((Math.abs(n-temp)));
       		temp = n;
        }
        	basket1.remove(0);
        	//the filled basket getting sorted
    		Collections.sort(basket1);
    		//removing the 0 from the basket
    		
    		
    		Collections.reverse(basket1);
    		
  
            
            
    		int compare=numberOfInputs-1;
    		
            for (Integer j: basket1){
//            	System.out.println("basket "+j+" vs "+compare);
            	
            	
            	if (j != compare){
            		pj = false;
            		break;
            		
            	}
            	if (compare==0){
            		pj = false;
            		break;
            	}
            	compare--;
            	
            }
            
            //the decision maker
            if (pj) 
            {
            System.out.println("Jolly");}
            else{
            	System.out.println("Not jolly");
            }
            
        }
        }
}
        

       
     
