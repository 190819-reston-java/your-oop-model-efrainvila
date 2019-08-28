package com.revature.ocean;

public abstract class SeaCreature {

	private String tag;
	private String size;
	private boolean predator;
	
	// generated from Source Menu
	public SeaCreature(String tag, String size, boolean predator) {
		super();
		this.tag = tag;
		this.size = size;
		this.predator = predator;
	}
	
	public SeaCreature(String tag, String size) {
		this(tag, size, true);
	}
	
	
	
	public void swim() {
		System.out.println(this.tag + " swimming about in the sea.");
		
	}
		
	public abstract void diet();
	
	public abstract void reproduce();
	
}
