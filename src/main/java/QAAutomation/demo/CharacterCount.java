package QAAutomation.demo;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "Hyderabad";
	      HashMap<Character, Integer> studentAges = new HashMap<>();
	        
	          for(char ch : str.toCharArray()) {
	             if(studentAges.containsKey(ch)) {
	                 studentAges.put(ch, studentAges.get(ch)+1);
	             } else{
	                 studentAges.put(ch,1);
	             }
	          }
	          
	          System.out.println(studentAges);

	}


	

}
