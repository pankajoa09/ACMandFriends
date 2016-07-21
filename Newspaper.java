import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.*;

class Main{
	
	public static void main (String args[]) throws IOException{
		
	
		
//		Scanner cin = new Scanner(System.in);
		
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		
		int testNumber = Integer.parseInt(cin.readLine()); //number of tests
	
		
		
		for (int i=0;i < testNumber;i++){

			HashMap<Character,Integer> table = new HashMap<Character,Integer>();
			
//			System.out.println("Number of tests "+ i+" "+testNumber);
			
			int numberPaid = Integer.parseInt(cin.readLine()); //number of paid characters
		
//			cin.nextLine();
			
//			System.out.println("the key map part");
			
//			FILLING THE KEY MAP
			for (int x=0; x < numberPaid; x++){
				String tableRaw = cin.readLine();
				String[] tablePaid = tableRaw.split(" ");
//				System.out.println(tablePaid[1]);
//				System.out.println(tableRaw);
//				System.out.println(tablePaid[0]);
				char character = tablePaid[0].charAt(0);
				int characterValue = Integer.parseInt(tablePaid[1]);
				table.put(character, characterValue);
				
			}
			
			
//		System.out.println("number of lines in the article ");	
		int linesArticle = Integer.parseInt(cin.readLine()); //// the number of lines in the article
		
		String article; //this is the article line
		
		double youngMullah = 0; //the money we be ballin with
		
		
//		System.out.println("enter the following lines of the article below");
		for (int l=0; l<linesArticle;l++){

//			System.out.println("in the loop");
			
			article = cin.readLine();
					
			char ch;

			
			for (int e=0;e< article.length(); e++){
				ch = article.charAt(e);
//				System.out.println(ch);
				if (table.containsKey(ch)){
//					System.out.println("We have this: "+ch);
					youngMullah += table.get(ch);
				}
				
			}
			
//			System.out.println("YOUNG MULLAH BABY: "+ youngMullah);
			
		}
		
		double getIt = youngMullah/100;
			
//		NumberFormat formatter = NumberFormat.getCurrencyInstance();
			
//		String answer = formatter.format(getIt).substring(1)+"g$";
			
		
		System.out.println(String.format("%.2f", getIt)+"$");		
			
	
		}

	
	}			
}
			
