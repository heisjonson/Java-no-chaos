import java.util.Scanner;

public class StringLetters{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			
			
			System.out.print("Enter a word: ");
			String word = input.nextLine();
		

		for (int count =0; count < word.length(); count++){
 		
 		if (count % 2 == 0){
 			char letter = word.charAt(count); 
 			System.out.println("Count" + count + ": " + letter);
 		}	 	


 
 	
 		
 }
 
 
 }
 }