import java.util.*;
public class Lab3 {

	public static void main(String[] args) {
		// Prompt user to pick a number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Card Number(1-52): ");
		String number;
		String suit;
		int card = input.nextInt();

		while (card>=1&&card<=52) {
			//make an if statement for the suits
			if (card>=1&&card<=13) {
				suit = " of Clubs";
			}
			else if (card>=14&&card<=26) {
				suit = " of Diamonds";
			}
			else if (card>=27&&card<=39) {
				suit = " of Hearts";
			}
			else if (card>=40&&card<=52) {
				suit = " of Spades";
			}
			else
				suit = "input";
			
			//make cases for each card identity
			card = card % 13;
			switch (card) {
				case 0: number = "King"; break;
				case 1: number = "Ace"; break;
				case 2: number = "Two"; break;
				case 3: number = "Three"; break;
				case 4: number = "Four"; break;
				case 5: number = "Five"; break;
				case 6: number = "Six"; break;
				case 7: number = "Seven"; break;
				case 8: number = "Eight"; break;
				case 9: number = "Nine"; break;
				case 10: number = "Ten"; break;
				case 11: number = "Jack"; break;
				case 12: number = "Queen"; break;
				default: number = "Invalid";
			}
			System.out.println("The card you picked is "+number+suit+"\n");
			if (number == "Invalid") {
				break;
			}
			else {
				System.out.print("Enter Card Number(1-52): ");
				card = input.nextInt();
			}
		}
		System.out.print("Invalid input");
	}
}	
