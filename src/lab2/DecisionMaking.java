package lab2;
import java.util.Scanner;
public class DecisionMaking {

	public static void main(String[] args) {
		//Scanner obj for input
		Scanner input = new Scanner(System.in);
		//variables
		int userNum;
		boolean evenOdd;
		char choice = 'Y';
		
		//loop to continue
		while (choice != 'N') {
		
			// user prompt
			System.out.println("Enter a number between 1 and a 100");
			userNum = input.nextInt();
			//loop to make sure user enters positive number less than 100
			while(userNum <= 1 || userNum >= 100) {
				// user prompt
				if(userNum <=1) {
					System.out.println("Number less than 1");
					
					}else {
						System.out.println("Number greater than 100");
						
					}
				
				System.out.println("Enter a number between 1 and a 100");
				userNum = input.nextInt();
			}
			//if statements
			if(userNum % 2 == 0) {
				evenOdd = true;
				
			}else {
				evenOdd = false;
			}
		
			if(evenOdd == false) {
				if(userNum >= 60){ 
					System.out.printf("%d odd and over 60%n", userNum);
				
				}else {
					System.out.printf("%d and odd%n",userNum);
				}
			
			
			}else {
				if(userNum <= 24) {
					System.out.println("Even and less than 25");
				}else if(userNum >=26 && userNum <= 60) {
					System.out.println("Even");
				}else {
					
					System.out.printf("%d Even", userNum);
				
				}
			}
			System.out.println("Continue?(Y/N)");
			choice = input.next().charAt(0);
		
		}
		System.out.println("bye");
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
