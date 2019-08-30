package com.revature.ocean;

import java.io.IOException;

public abstract class SeaCreature implements Comparable<SeaCreature>{

	private String tag; // a tag id on creature
	private String size; // size of creature tagged
	private int travel; // distance traveled
	// private boolean gender; // gender of creature (True for female, False for males)
	
	
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
			throw new NetException(); // throw exception to NetException.java - no negative travel allowed 
		}
		this.travel = travel; 
	}

	// generated from SourceMenu - toString override
	@Override
	public String toString() {
		return "Tag Name = " + tag + ", Current Size = " + size + ", Distance Traveled = " + travel + " miles";
	}
	
	// can compare both shark and turtle via size
	public int compareTo(SeaCreature o) {
		// attempted to compare distance as an int here but this line below only allows strings as parameter
		return this.getSize().compareTo(o.getSize());
	}
}
