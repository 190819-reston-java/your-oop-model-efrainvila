package com.revature.ocean;

public class Shark extends SeaCreature implements Air {


	public Shark(String tag, String size, int travel) {
		super(tag, size, travel);
		
	}
	
	public Shark(String tag, String size) {
		this(tag, size, 15624);
	}
	
	public Shark(String tag) {
		this(tag, "7 feet 5 inches");
	}
	
	public Shark() {
		this("Pico");
		
	}
	

	public void breathing() {
		System.out.println(" breaths through gills.");

	}

	@Override
	public void diet() {
		System.out.println(this.getTag() + " hunts turtles for food.");

	}

	@Override
	public void reproduce() {
		System.out.println(this.getTag() + " only 1 offspring survive.");

	}

}