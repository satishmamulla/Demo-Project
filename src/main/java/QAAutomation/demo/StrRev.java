package QAAutomation.demo;

public class StrRev {

	public static void main(String[] args) {
		
		String name = "Satish";
		
		String rev = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			rev = rev+name.charAt(i);
		}
      System.out.println(rev);
	}

}
