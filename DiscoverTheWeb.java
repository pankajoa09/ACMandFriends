import java.util.*;

public class Main{
	
	public static void main (String args[]){
		
		Scanner cin = new Scanner(System.in);
		int testCases = cin.nextInt();
		int i=0;
		cin.nextLine();
		while (i<testCases){
			System.out.println("Case "+(i+1)+":");
			boolean control = true;
			Stack<String> forward = new Stack<String>();
			Stack<String> backward = new Stack<String>();

			String currentPage = "http://www.lightoj.com/";	
			//System.out.println("begin currentpage:"+currentPage);
			
			String specifiedPage = null;
			
			while (control==true){
				
		
				String input = cin.nextLine();
				//System.out.println("IN: "+input);
				
				String[] commands = input.split(" ");	
				String command = commands[0];
	
				
				if (command.equals("VISIT")){
					//	System.out.println("we went into VISIT");
					specifiedPage = commands[1];
					backward.push(currentPage);
					currentPage = specifiedPage;
					forward.clear();
					
					System.out.println(currentPage);
				}
				
				//System.out.println(page);
			
				if (command.equals("BACK")){
					//if backward stack is empty, ignore command
					if (backward.empty()){
						System.out.println("Ignored");}
					//else push the current page on the top of the forward stack
					else{
						forward.push(currentPage);
						currentPage=backward.pop();
						
						System.out.println(currentPage);}
				}
				
				if (command.equals("FORWARD")){
					if (forward.empty()){
						System.out.println("Ignored");}
					else {
					//	System.out.println("1: "+ currentPage);
						backward.push(currentPage);
						currentPage=forward.pop();
						//System.out.println("2: "+ currentPage);
						
						System.out.println(currentPage);
					}
				}
				
				
				if (command.equals("QUIT")){
					backward.clear();
					forward.clear();
					i++;
					control = false;
					break;
					}
				
				
				
				
				
			}
			
			
			
			
		}
	}
}


