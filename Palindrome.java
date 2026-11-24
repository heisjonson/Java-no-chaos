
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


  System.out.print("Enter a word: ");
  String word = input.nextLine();
  
 
 
 String reverse = "";
 	
 	for (int count =0; count < word.length(); count++){
 	
 		 reverse = word.charAt(count) + reverse;	 		
 }
 
		System.out.println(reverse);
		
	if (word == reverse){
 			System.out.println("This is a palindrome");
 		}
 		
 		else{
 			System.out.println("This is not a palindrome");
 		}
 		
}
}
 