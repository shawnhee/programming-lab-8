//Author's name: Shawn Song-Yang Hee
// Matric number: 227845
// Lab No: 8
import java.util.Scanner;

public class pyramidOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=0;//Initialize number
        //Validate if user input positive digit. Else, redo.
        while(true) {
        	System.out.print("Enter the number of lines: "); //Prompt user to input number of lines
        	number = sc.nextInt();  //User input number of lines
        	//If user inputs negative digit, display warning, else proceed to pyramid process
        	if (number <= 0) {
            System.out.println("Invalid input");
        	}
        	else {
        	break;
        	}
        }
        
        //Initializing variable
        int outputNumber = number;  //Initialize output number to number from the number of lines
        int count = 0;  // Initialize count
        //Start the process if user input positive integer
        while (number >= 1) {
        	//If displayed number has reached lowest number (1), then increment the count by 1
            if (outputNumber == 1) { 
                System.out.print(outputNumber++ + " ");
                count++; 
            } 
            //If count is 0, print numbers decreasingly to 1.
            else if (count == 0) {
                System.out.print(outputNumber-- + " ");
            }
            //If output number already exceed input number then reset count, decrement user input number by 1 and stop the number at current number and go to next line 
            else if (outputNumber > number) {
                count = 0;
                number--;
                outputNumber = number;
                System.out.println();
            } 
            //Increase the output number
            else {  
                System.out.print(outputNumber++ + " ");
            }
           // When whole pyramid reaches last value (1)
            if (number == 1) {
                System.out.print(number);
                break;  // Exit the loop
            }
        }
        sc.close();
    }
}
