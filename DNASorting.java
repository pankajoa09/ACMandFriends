import java.util.*;


class Main{

	static class ResultPair {
		
		String DNAString;
		int Count;

		public ResultPair(String DNAString, int Count){
			this.DNAString = DNAString;
			this.Count = Count;
		}

	}
	
	static class SortCompare implements Comparator<ResultPair>{
		public int compare(ResultPair one, ResultPair two){
			return one.Count - two.Count;
		}
	}
	
	
	
	
	public static void main(String args[]){
		
		HashMap<String, Integer> alpha = new HashMap<String, Integer>();
		alpha.put("A",1);
		alpha.put("C",2);
		alpha.put("G",3);
		alpha.put("T",4);
		

		
		
		List<ResultPair> results = new ArrayList<ResultPair>();
		
		Scanner cin = new Scanner(System.in);
	
	
		String nums = cin.nextLine();
		String[] numsa = nums.split("\\s+");
		int n = Integer.parseInt(numsa[0]); //length of string
		int m = Integer.parseInt(numsa[1]); //number of strings
		

		for (int a=0; a < m;a++){

			
			String givenString = cin.nextLine();
			
			if (givenString.length() != n){
				break;
			}
		
			int count = 0;
		
			for (int i=0;i < givenString.length()/*GONNA CHANGE*/;i++){
				String reducedString = givenString.substring(i);
				String Letter = reducedString.substring(0,1);
				int LetterVal = alpha.get(Letter);
			//System.out.println(Letter+" "+reducedString+" "+LetterVal);
			
				for (int x=0; x < reducedString.length();x++){
					String subLetter = reducedString.substring(x,x+1);
					int subLetterVal = alpha.get(subLetter);
					if (LetterVal > subLetterVal){
					count++;}
				
					}	
			
			
		}
		

		String sortie = String.valueOf(count)+" "+givenString;
		
		
		ResultPair resultpair = new ResultPair(givenString,count); //Not sure what I did here
		
		resultpair.DNAString = givenString;
		resultpair.Count = count;
		
		
		results.add(resultpair);
		

		
		}
		
		SortCompare sortcompare = new SortCompare();
		
		Collections.sort(results, sortcompare);
		

		
		for (ResultPair j : results){
			System.out.println(j.DNAString);
			
		}
		
		}
	
	}
