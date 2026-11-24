import java.util.Scanner;

public class LoopAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


  


 int sum = 0;
 double average =0;
 int count =1;
 

 	
 	for (; count >0; count++){
 	
 	 System.out.print("Enter a Number(-1 to stop): ");
  	int number = input.nextInt();
  	
  	 if (count > 1){
 	sum += number;
 	 average = sum / count;
 	
 	System.out.printf("The average is %f%n", average);
 	 if (number == -1){
 	 	break;
 	 }
 	}
 }
}
}
 