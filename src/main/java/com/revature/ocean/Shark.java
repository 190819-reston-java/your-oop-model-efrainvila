package com.revature.ocean;

public class Shark extends SeaCreature  { 
	
	// shark population counter
	public static int population = 0;

	public Shark(String tag, String size, int travel) {
		super(tag, size, travel);
		population++;
	}
	
	public Shark(String tag, String size) {
		this(tag, size, 0); // default value of 0 since it is an int
	}
	
	public Shark(String tag) {
		this(tag, "Unknown Size"); // default value
	}
	
	public Shark() {
		this("Untagged Shark"); // default value
		
	}


	@Override
	public void diet() {
		System.out.println(this.getTag() + " hunts turtles for food.");

	}

	@Override
	public void reproduce() {
		System.out.println(this.getTag() + " only produces 1 offspring.");

	}
	
	public void diet(Human man) {
		System.out.println(this.getTag() + " is a man eater!!");
	}

	
}