package com.revature.ocean;

public abstract class SeaCreature {

	private String tag; // a tag id on creature
	private String size; // size of creature tagged
	private boolean predator; // is creature a predator
	
	
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

	public boolean isPredator() {
		return predator;
	}

	public void setPredator(boolean predator) {
		this.predator = predator;
	}

	// generated from SourceMenu
	@Override
	public String toString() {
		return "SeaCreature [tag=" + tag + ", size=" + size + ", predator=" + predator + "]";
	}
	
	
	
}
