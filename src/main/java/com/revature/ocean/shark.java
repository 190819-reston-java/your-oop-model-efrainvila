package com.revature.ocean;

public class Shark extends SeaCreature implements Air {

	public Shark(String tag, String size, boolean predator) {
		super(tag, size, predator);
		
	}

	public void breathing() {
		System.out.println("breaths through gills.");

	}

	@Override
	public void diet() {
		System.out.println("hunts turtles for food.");

	}

	@Override
	public void reproduce() {
		System.out.println("only 1 offspring survive.");

	}

}