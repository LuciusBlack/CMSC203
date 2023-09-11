import java.util.Scanner;
import java.util.Random;

public class ESP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int round = 1;
		int attempt = 11;
		String guess;
		String color = ""; 
		String name;
		String MC_NUM;
		String Description;		
		int correct = 0; 
		
		
		Random rand = new Random();
		
		

		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter your name");
		
		name = keyboard.nextLine();
		
		System.out.println("Enter your MC ID");
		
		MC_NUM = keyboard.nextLine();
	
		System.out.println("Enter a Statement about yourself:");
		
		
		Description = keyboard.nextLine();
		
	
		
		
for(int i = 0; i < attempt ; i++) {
	
	System.out.print("Round " + round + "\nGuess Between (Yellow, Blue, Red, Orange, Red) now: " );

	
	int random = rand.nextInt(5);
switch(random) {
	

	case 0: color = "Red";
	break;
	
	case 1: color = "Blue";
	break;
	
	case 2: color = "Yellow";
	break;
	
	case 3: color = "Orange";
	break;
	
	case 4: color = "Green";

	
	}
	
	guess = keyboard.nextLine();
		
	if(guess.equalsIgnoreCase(color) ) {
		
		System.out.println("Correct!");
		correct ++;
	}
	
	
	System.out.println("I have selected " + color + ", and you have selected " + guess);
	round++;
	

}
		

System.out.println("You have guessed " + correct + " colors correctly out of " + attempt + " attempts!");
		
System.out.println("Name: " + name);

System.out.println("MCID: " + MC_NUM);

System.out.println("Description about yourself: " + Description);	
		

	}

}
