//Author's name: Shawn Song-Yang Hee
// Matric number: 227845
// Lab No: 8
import java.util.Scanner;
public class zooEntraceFee {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		//Ticketing Table
		    System.out.println("-----------------------------------------------------------------------------------------------------");
		    System.out.println("Category                         | Malaysian | Foreigner (I-KAD/Work/Dependent) | ASEAN   | Others  |");
		    System.out.println("-----------------------------------------------------------------------------------------------------");
		    System.out.println("Adult                            | RM43.00   | RM50.00                          | RM61.00 | RM82.00 |");
		    System.out.println("Children (3 to 12 years old)     | RM16.00   | RM25.00                          | RM33.00 | RM43.00 |");
		    System.out.println("Senior Citizen (60 years and up) | RM21.00   | RM50.00                          | RM61.00 | RM82.00 |");
		    System.out.println("-----------------------------------------------------------------------------------------------------\n");
		//Ticketing Process
		//Initializing all variables
		char nationality=' ';
		char category=' ';
		int tickets=0;
		char newTicket=' ';
		double price=0.0;
		double finalPrice=0;
		double totalPrice=0;
		char foreigner=' ';
		char newVisitor='Y';
        int visitor=1;		
        //Add new visitor if user input Y to add new visitor
		//NOTE: All char below will convert to upper case letter, so that system can read even though user input lower case letter
		while(newVisitor=='Y'){
			System.out.println("\n****** Visitor "+visitor+"******\n");
			do{
			//Prompt user to input nationality
			System.out.print("Enter your nationality (M - Malaysian, F - Foreigner): ");
			nationality=sc.next().toUpperCase().charAt(0);
			
			//If nationality is F (Foreigner)
			if(nationality=='F'){
			//Prompt user to input I/E/O category
			System.out.print("From which part? (I - I-KAD/Work Permit/Dependent, E - ASEAN, O - Others): ");
			foreigner=sc.next().toUpperCase().charAt(0);
			}
			//Prompt user to input A/C/S category
			System.out.print("Choose a category of the visitor (A-Adult, C-Children, S-Senior): ");
			category=sc.next().toUpperCase().charAt(0);
			//Prompt user to input number of tickets
			System.out.print("Number of tickets: ");
			tickets=sc.nextInt();

			//If nationality is M (Malaysian)
			if(nationality=='M'){
				//Switch case process for category types.Assign price based on Malaysian nationality age category.
				switch(category){
					case 'A': price=43.00;
					break;
					case 'C': price=16.00;
					break;
					case 'S': price=21.00;
					break;
					default: System.out.println("Invalid input!");
					continue;
				}
			}
			//If nationality is F (Foreigner)
			else if (nationality=='F'){
				//Switch case process for foreigner types. Assign price based on foreigner's type age category.
				switch (foreigner) {
					case 'I':
					if(category=='A') price=50.00;
					else if(category=='C') price=25.00;
					else if(category=='S') price=50.00;
					else System.out.println("Invalid input!");
					break;

					case 'E':
					if(category=='A') price=61.00;
					else if(category=='C') price=33.00;
					else if(category=='S') price=61.00;
					else System.out.println("Invalid input!");
					break;

					case 'O':
					if(category=='A') price=82.00;
					else if(category=='C') price=43.00;
					else if(category=='S') price=82.00;
					else System.out.println("Invalid input!");
					break;
					default:{
						System.out.println("Invalid input!");
						continue;
					}
					}
				}
				else{
					System.out.println("Invalid input!");
					continue;
				}
				//calculate total price of tickets
				totalPrice=price*tickets;
				//sum of all tickets of the user
				finalPrice += totalPrice;
				//output price based on selected ticket of user
			    System.out.printf("Visitor Type %c Charge: %.2f\n",category,totalPrice);
			    //Prompt user to buy another ticket
				System.out.print("Buy another ticket (Y/N)?: ");
				newTicket=sc.next().toUpperCase().charAt(0);
			}while(newTicket=='Y');//buy another new ticket for user if user input Y
				
				//Output sum of all tickets of the user
				System.out.printf("The total payment for Visitor %d is RM%.2f\n\n",visitor,finalPrice);
				//Prompt user to enter another visitor
				System.out.print("Enter another visitor(Y/N)?:");
				newVisitor=sc.next().toUpperCase().charAt(0);
				//if user input N (not entering another visitor), then display bye message and end the process
				if(newVisitor=='N'){
				System.out.println("Bye bye~");
				System.exit(0);
				}
				
				//Increment visitor by 1 and reset the final price for each new visitor
				visitor++;
				finalPrice=0;
			}
			sc.close(); //end the scanner input 
		} 
	}

