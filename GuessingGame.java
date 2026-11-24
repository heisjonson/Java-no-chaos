import java.util.Scanner;

	public class GuessingGame{
		public static void main(String[] args){
			Scanner input = new Scanner (System.in);
			
			
			
			System.out.print("Enter A Random Number(1-100): ");
			int number = input.nextInt();
			
			int random = 41;
 			int count =1;
 			
 			if (number > 0 && number <= 99){
 				for (; count <= 99; count++){
 			System.out.print("Enter A Random Number(1-100): ");
			number = input.nextInt();
 					
 					
 					
 			if (number == -1){
 				System.out.print("You quit the game");
 				break;

 			}
 			
 			if (number == random){
 			System.out.printf("You guessed right number is: %d", random);
 			break;
 				}
 				System.out.println("Try again");
 			}
			
			
			
		}
	
				
	}
	}
