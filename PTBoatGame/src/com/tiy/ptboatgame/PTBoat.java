package com.tiy.ptboatgame;

public class PTBoat {

//	private String row;
	int location;
	
	// Provide a constructor
	
	public PTBoat(int column) {
		this.location = column;
		
	}

	public boolean isHit(int column)
	{
	return(column == location);
	}
	
}
