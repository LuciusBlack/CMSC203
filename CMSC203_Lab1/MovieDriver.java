import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner line = new Scanner(System.in);		
		
		Movie movie = new Movie();	
		
		String choice;	
		char choice_2;
		
		
		do
		{
		System.out.println("Enter the title of the movie");
		movie.setTitle(line.nextLine());
		
		System.out.println("Enter rating of the movie");
		movie.setRating(line.nextLine());
		
		System.out.println("Enter the amount of tickets sold to this movie");
		movie.setSoldTickets(line.nextInt());
		
		
		System.out.println(movie.toString());
		System.out.println();
		
		System.out.println("Would you like to try again Y | N");
		
		line.nextLine();
		
		choice = line.nextLine();
		choice_2 = choice.charAt(0);
		
	}while(choice_2 == 'Y');
	
	
System.out.println("Goodbye!");
	
	}
	
	

}
