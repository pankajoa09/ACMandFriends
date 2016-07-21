import java.util.*;

class Main{
	
	public static void main(String args[]){
		
		Scanner cin = new Scanner(System.in);
		
		List<Integer> results = new ArrayList<Integer>();	// for the results
		while (cin.hasNextLine()){
			
		String givenString = cin.nextLine();
		
		if (givenString.equals("end")){
			break;
		}
		
		List<Character> stack = new ArrayList<Character>(); // for the stack
		
		int stackCount = 0;
		
		for (int x=0; x < givenString.length(); x++){
			char container = givenString.charAt(x);
			
			
			//if there is no stack ,add a container to the default stack
			if (stack.isEmpty()){
				stack.add(container);
				stackCount++;
//				System.out.println(container +" :there wasnt a stack so I added one");
				}
			
			//if the current container is lower or equal to all stacktops, put on closest .numericalValue() stacktop
			else if (container < Collections.max(stack)){
				int minDistance=Character.getNumericValue(Collections.max(stack));
				int Distance;
				//go through the list to find the smallest possible gap between container distance values
				for (char index : stack){
					Distance = Character.getNumericValue(index)-Character.getNumericValue(container);
//					System.out.println("Distance "+Distance+","+index);
					if (Distance < minDistance){
						if (Distance >= 0){
						minDistance = Distance;}
					}
				}
//				System.out.println("Min dist"+ minDistance);
				int DistanceSecond;
				char closestContainer = 0;
				// go through the stack once again to find that lowest container value distance
				for (char index : stack){
					DistanceSecond =  Character.getNumericValue(index)-Character.getNumericValue(container);
					if (DistanceSecond == minDistance){
						closestContainer = index; //put it where the closestContainer is 
						break;
					}		
				}
				
//				System.out.println("Closest Container: " + closestContainer);
//				System.out.println(container + ":placed a container on stack " + stack.indexOf(closestContainer));
				stack.set(stack.indexOf(closestContainer),container);
				
			}
				
			
			//if the current container is greater than all stacktops, new stack
			else if (container > Collections.max(stack)){
				stack.add(container);
				stackCount++;
//				System.out.println(container+" :greater than all stacktops,made a new stack");
			}
			
			else{ 
//			System.out.println("Man this is some ");
				}

	}
		
	
//	System.out.println(stackCount);
	//adding them to the results
	results.add(stackCount);
	
//	for (char j : stack){
//		System.out.println("Final stack: "+j);
//	}

}
		int cases=0;
		for (Integer count : results){
			cases++;
			System.out.println("Case "+cases+": " +count);
		}

