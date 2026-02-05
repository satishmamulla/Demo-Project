package QAAutomation.demo;

public class FirstProgram {

	public static void main(String[] args) {
		
		String city = "Hyderabad";
        char target = 'a';
        int count = 0;
        
        for(int i=0; i<city.length(); i++){
            if(city.charAt(i) == target){
                count++;
            }
        }
        System.out.println(count);
        
    }

}
