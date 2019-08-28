package com.revature.ocean;

public abstract class SeaCreature {

	private String tag; // a tag id on creature
	private String size; // size of creature tagged
	private static int travel; // distance traveled
	
	
	// generated from Source Menu
	public SeaCreature(String tag, String size, int travel) {
		super();
		this.tag = tag; 
		this.size = size; 
		this.travel = travel;
	}
	
	public SeaCreature(String tag, String size) {
		this(tag, size, travel);
	}
	
	
	
	public SeaCreature() {
		this("Untagged creature");
	}
	
	public SeaCreature(String tag) {
		this(tag, "Unknown size");
	}
	
	
	
	public void swim() {
		System.out.println(this.tag + " swimming about in the sea.");
		
	}
		
	public abstract void diet();
	
	public abstract void reproduce();

	// generated from Source Menu
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

	public int istravel() {
		return travel;
	}

	public void setDistance(int travel) {
		this.travel = travel;
	}

	// generated from SourceMenu
	@Override
	public String toString() {
		return "[tag id = " + tag + ", current size = " + size + ", distance traveled = " + travel + " miles]";
	}
	
	
	
}
