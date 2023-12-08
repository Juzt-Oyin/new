package week6;

import java.util.Random;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println
		("\t\t Welcome to Gameland \n \t\t\tBy Rafiat");
		System.out.println
		("===========================Rock Paper Scissors===========================");
		//Creating a scanner for name input
		System.out.println("\n Enter Name--:");
		Scanner sc =new Scanner (System.in);
		
		String playerName = sc.nextLine();
		String computerName = "Myonie";
		
		System.out.println("Welcome " +playerName+
				", you'll be playing against " +computerName );
		System.out.println("Enter Choice:" + " \n Choose \n R---Rock \n P--- Paper "
				+ "\n S---Scissors \n Q--- Quit: ");

		//For Scores
		int playerScore =0;
		int computerScore = 0;
		
		while (true) 
		{
			//For Choices
			Random rand = new Random ();
			String playerChoice = sc.nextLine();
			
			String []choices = {"R", "P", "S"};
			
			if (!playerChoice.equals("[Rr,Pp,Qq]")){
				System.out.println("Invalid choice");
			} 
			
			
			
			int randomNum = rand.nextInt (3)+1;
			String computerChoice = choices[randomNum];
			
			System.out.println("Myonie plays: " +computerChoice);
			
			if (playerChoice.equals(computerChoice))
				{
				System.out.println("It's a tie!");
				}
			else if ((playerChoice.equals("R") && computerChoice.equals("S")) ||
					(playerChoice.equals("P") && computerChoice.equals("R")) ||
					(playerChoice.equals("S") && computerChoice.equals("P"))) 
						{
						System.out.println("You win!");
						playerScore ++;
						}
					else {
						System.out.println("You lose!");
						computerScore ++;	
						}
		
			System.out.println("Your score is " +playerScore);
			System.out.println("Myonie's score is " +computerScore);
			
			if (playerScore > computerScore) {
				System.out.println("You win!");
			}
			else if (playerScore < computerScore){
				System.out.println("You lose!");
			}
			else {
				System.out.println("It's a tie!");
			}
			
			if (playerChoice.equals("Q")) {
				System.out.println("Thanks for playing.");
				break;
				}
		} 
		
		//Question 2a
		int number = sc.nextInt();

		if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else if (number <= 3) {
            System.out.println(number + " is a prime number.");
        } else if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is not a prime number.");
        }

		
	}
}
		
		

		
		

	


