package com.tiy.ptboatgame;

public class PTBoatGame {
	
	private PTBoat[] ptBoats = new PTBoat[6];
	private int numberOfBoats = 0;

	public void addBoat(int location){
		ptBoats [numberOfBoats] = new PTBoat(location);
		
		numberOfBoats++;
	}
	
		// Add a new boat to the ptBoats array

	    // You will need to use the numberOfBoats
	    // value to tell you what element of the
	    // array to initialize

	    // remember to increment the numberOfBoats 
	    // before you leave
	

	public boolean guess(int location)/*String row, int column*/
	{
		for (int i = 0; i < ptBoats.length; i++ ){
			if(ptBoats[i].location == location){
				return true;
			}
		}
		return false;
	    // Check to see if the guess hit any of the ships.
	    // Return true only if a ship was hit

	} 

	public static void main(String[] args)
	{
		PTBoatGame game1 = new PTBoatGame();
		
		game1.addBoat(4);
		game1.addBoat(17);
		game1.addBoat(21);
		game1.addBoat(24);
		game1.addBoat(35);
		game1.addBoat(1);
		
		if (game1.guess(2)){
			System.out.println("Hit");
		}
		else{
			System.out.println("Miss");
		}
//		for (int i = 0; i < 6; i++)
//			{
//				PTBoat aNewBoat =new PTBoat(i, false);	//Creates a new boat?
//				
//				ptBoats[i] = aNewBoat;
//				numberOfBoats++;		
//			}

		
	    // Create a PTBoatGame instance

	    // Add 6 PTBoats

	    // Take six guesses and output the following string for each
	    // If the guess hit a pt boat...
	    // Guess number # at row <row>, column <column> hit a PTBoat

	    // If the guess missed all boats
	    // Guess number # missed

	}

}
