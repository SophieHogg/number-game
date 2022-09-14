package javaNumberGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int randomNumber = Utils.getRandomNumber();
		Scanner userInput = new Scanner(System.in);
		System.out.println("You have 10 attempts to guess a number between 1 and 100.");
		for (int i = 1; i<11; i++) {
			System.out.format("Please enter guess #%d.\n", i);
			int userGuess = userInput.nextInt();
			
			//ensures guess is between 1 and 100
			if (userGuess < 0 || userGuess > 100) {
				System.out.println("Please enter a number between 1 and 100.");
				i--;
			}
			
			// if user guesses correct number
			else if (userGuess == randomNumber) {
				System.out.println(Utils.returnSuccessToUser(randomNumber, i));
				break;
			}
			
			// if user doesn't guess the word within 10 attempts.
			else if (i == 10) {
				System.out.println(Utils.returnFailureToUser(randomNumber));
				break;
			}
			
			// default case
			else {
				System.out.println(Utils.returnFeedbackToUser(userGuess, randomNumber, i));
			}
		}
		userInput.close();
	}
}

