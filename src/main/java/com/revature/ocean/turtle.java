package com.revature.ocean;

public class Turtle extends SeaCreature implements Air {

		
	public Turtle(String tag, String size, boolean predator) {
		super(tag, size, predator);
		
	}

	public void breathing() {
		System.out.println("takes in a breath on surface and dives underwater.");

	}

	@Override
	public void diet() {
		System.out.println("prefers sea grass.");

	}

	@Override
	public void reproduce() {
		System.out.println("lays eggs on beach.");

	}

}