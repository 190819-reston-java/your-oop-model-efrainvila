package com.revature.ocean;

public class Turtle extends SeaCreature implements Air {

		
	public Turtle(String tag, String size, int travel) {
		super(tag, size, travel);
		
	}

	public Turtle() {
		this("Lal");
	}
	
	public Turtle(String tag) {
		this(tag, "7 feet 5 inches");
	}


	public Turtle(String tag, String size) {
		this(tag, size, 1842);
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