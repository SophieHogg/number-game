package javaNumberGame;

public class Utils {
	static int min = 0;
	static int max = 101;
	
	public static int getRandomNumber () {
	int randomInteger = (int) (Math.floor(Math.random()*(max-min+1)+min));
	return randomInteger;
	}
	
	
	public static String returnSuccessToUser (int correctNumber,int attempt) {
		String attemptWord = "";
		if (attempt == 1) {
			attemptWord = "attempt";
		}
		else {
			attemptWord = "attempts";
		}
		return String.format("Congratulations, you guessed \"%s\" in %d %s.", correctNumber, attempt, attemptWord);
	}
	
	public static String returnFailureToUser (int correctNumber) {
		return String.format("Sorry, you failed to guess \"%d\" in 10 attempts.", correctNumber);
	}
	
	public static String returnFeedbackToUser (int guessedNumber, int correctNumber, int attempt) {
		String compareWord = "";
		if (guessedNumber > correctNumber) {
			compareWord = "larger";
		}
		else {
			compareWord = "smaller";
		}
		return String.format("Your guess (#%d) was %d, which is %s than the correct number.", attempt, guessedNumber, compareWord);
	}
}