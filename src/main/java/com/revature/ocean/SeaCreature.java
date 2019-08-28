package com.revature.ocean;

public abstract class SeaCreature {

	private String tag;
	private String size;
	private boolean carnivore;
	
	// generated from Source Menu
	public SeaCreature(String tag, String size, boolean carnivore) {
		super();
		this.tag = tag;
		this.size = size;
		this.carnivore = carnivore;
	}
	

	public void swim() {
		System.out.println(this.tag + " swimming and avoiding predators.");
		
	}
	

	
	public abstract void feed();
	
	public abstract void reproduce();
	
}
