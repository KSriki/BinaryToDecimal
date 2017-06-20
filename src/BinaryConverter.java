import java.util.Scanner;

public class BinaryConverter {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String binary = "";
		int dec = 0;
		int count = 0;
		
		System.out.println("Enter Binary to convert: ");
		binary = scan.next();
		for(int i = binary.length() - 1; i >= 0;i--){
			if((binary.charAt(i)) == '1'){
				dec += Math.pow(2, count);
				
			}
			count++;
			
		}
		
		System.out.println("The decimal value of " + binary + " is " + dec);
		
		
		
	}
}
