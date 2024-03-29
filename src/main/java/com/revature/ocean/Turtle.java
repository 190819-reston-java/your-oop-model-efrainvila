package com.revature.ocean;

public class Turtle extends SeaCreature implements Air {

	// turtle population counter
	public static int population = 0;	
	
	public Turtle(String tag, String size, int travel) {
		super(tag, size, travel);
		population++;
	}
	
	public Turtle(String tag, String size) {
		this(tag, size, 0); // default value of 0 since it is an int
	}
	
	public Turtle(String tag) {
		this(tag, "Unknown size"); // default value
	}
	
	public Turtle() {
		this("Untagged Turtle"); // default value
	}

	public void breathing() {
		System.out.println(this.getTag() + " takes in a breath on surface and dives underwater.");

	}

	@Override
	public void diet() {
		System.out.println(this.getTag() + " prefers eating sea grass.");

	}

	@Override
	public void reproduce() {
		System.out.println(this.getTag() + " lays many eggs on the beach.");

	}
	
	public void diet(Fish fish) {
		System.out.println(this.getTag() + " prefers hunting fish.");
	}
	
	public void diet(Crustacean crab) {
		System.out.println(this.getTag() + " loves eating crabs!");
	}
}
	
