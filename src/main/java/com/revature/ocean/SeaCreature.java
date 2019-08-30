package com.revature.ocean;

import java.io.IOException;

public abstract class SeaCreature {

	private String tag; // a tag id on creature
	// private boolean gender; // gender of creature (True for female, False for males)
	private String size; // size of creature tagged
	private int travel; // distance traveled
	
	
	
	// generated from Source Menu - constructors
	public SeaCreature(String tag, String size, int travel) {
		super();
		this.tag = tag; 
		this.size = size; 
		this.travel = travel;
	}
	
	public SeaCreature(String tag, String size) {
		this(tag, size, 0);
	}
	
	public SeaCreature(String tag) {
		this(tag, "Unknown size");
	}
	
	public SeaCreature() {
		this("Untagged creature");
	}
	
	
	public void swim() {
		System.out.println(this.tag + " swimming about in the sea.");
		
	}
		
	public abstract void diet();
	
	public abstract void reproduce();

	// generated from Source Menu - getters and setters
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getTravel() {
		return travel;
	}

	public void setTravel(int travel) {
		if (travel < 0) {
			throw new NetException(); // throw exception to NetException.java - no negative travel 
		}
		this.travel = travel; 
	}

	// generated from SourceMenu - toString override
	@Override
	public String toString() {
		return "[tag id = " + tag + ", current size = " + size + ", distance traveled = " + travel + " miles]";
	}
	
	
}
