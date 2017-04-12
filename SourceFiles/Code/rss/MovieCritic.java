package Code.rss;

import edu.cmu.ri.createlab.rss.readers.MovieReader;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

import java.util.Scanner;
/*  This program turns the Finch into a movie critic
 *  by having them access the rotten tomatoes score of a recent movie.  
 *  This program demonstrates use of a number of String class methods.
    Author:  Tom Lauwers
    Date:  2/15/2009
 */


public class MovieCritic
{
	public static void main(String[] args)
	{
	    // Instantiating the Finch object
        Finch myFinch = new Finch();
		
		MovieReader reader = new MovieReader(); // instantiate a movie reader
		Scanner s = new Scanner(System.in);     // instantiate scanner object
		
		String title; // user input of a title
		
	
		
		System.out.println("Please enter the title of a movie you want the rating for, or enter 'EVERYTHING' to show all movies with ratings: ");
		title = s.nextLine(); // read in the title that the user entered
		
		// Check to see if user request a full print out of all the movies
		if(title.equals("EVERYTHING")) {
			// this loop moves up index by one and then prints out that movie title
			for(int i = 0; i < reader.getEntryCount(); i++) {
				reader.setIndex(i);
				System.out.println(reader.getMovie());
			}
			// Now that everything's been printed give people the option to search again for a movie
			System.out.println("Which movie would you like to get a rating for?");
			title = s.nextLine();
		}
		
		int i = 0;
		boolean found = false; // set to true when a movie title matches user input
		// Continue this loop as long as you haven't found the movie or aren't out of entries
		while(found == false && i < reader.getEntryCount()) {
				reader.setIndex(i); // set the entry index
				
				// If the title equals user input, do the following
				if(title.equals(reader.getMovie()))
				{
					
					int rating = reader.getRating();
					// -1 is the rating if no rating exists yet
					if(rating == -1) {
						myFinch.saySomething("Sorry " +title + " has not yet been rated on Rottentomatoes");
						System.out.println(title + " has not yet been rated on Rottentomatoes"); 	
					}
					
					// If a rating exists, the Finch will tell you what it is with a little interpretation
					else {
						if(rating < 20) {
							myFinch.saySomething("Don't even bother, " + title + " received " + reader.getRating() + "% on Rottentomatoes");
							myFinch.setLED(255,0,0);
							myFinch.buzz(550, 500);
							myFinch.sleep(500);
							myFinch.buzz(330, 800);
							
						}
						
						else if(rating < 50) {
							myFinch.saySomething("Wait to rent it, " + title + " received " + reader.getRating() + "% on Rottentomatoes");
							myFinch.setLED(255,255,0);
							
						}
						
						else if(rating < 80) {
							myFinch.saySomething("Probably worth going, " + title + " received " + reader.getRating() + "% on Rottentomatoes");
							myFinch.setLED(100,255,0);	
						}
						
						
						else {
							myFinch.saySomething("I'm off to the movies, and you should come with me " + title + " received " + reader.getRating() + "% on Rottentomatoes");
							myFinch.setLED(0,255,0);
                                                        myFinch.setWheelVelocities(150,-150,600);
							myFinch.setWheelVelocities(200, 200,1000);
						}
						
					}
					found = true; // set found to true
				}
				i++;
			}
			// If you loop through everything without finding anything, tell the user
			if(found == false) {
				myFinch.saySomething("We didn't find anything by that title");
				System.out.println("We didn't find anything by that title");
			}
	  // Sleep for a while so you can see the LED before quit is called.
	  myFinch.sleep(7000);
	  // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
	}
}