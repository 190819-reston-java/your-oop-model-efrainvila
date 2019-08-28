<<<<<<< HEAD:src/main/java/com/revature/ocean/turtle.java
package com.revature.ocean;

public class Turtle extends SeaCreature implements Air {

	public static int population = 0;	
	
	public Turtle(String tag, String size, int travel) {
		super(tag, size, travel);
		population++;
	}
	
	public Turtle(String tag, String size) {
		this(tag, size, 1842);
	}
	
	public Turtle(String tag) {
		this(tag, "3 feet 6 inches");
	}
	
	public Turtle() {
		this("Lal"); // attempting to look for a default
	}

	public void breathing() {
		System.out.println(" takes in a breath on surface and dives underwater.");

	}

	@Override
	public void diet() {
		System.out.println(this.getTag() + " prefers sea grass.");

	}

	@Override
	public void reproduce() {
		System.out.println(this.getTag() + " lays eggs on beach.");

	}
	
	public void diet(Fish fish) {
		System.out.println(this.getTag() + " prefers hunting fish.");
	}
	
	public void diet(Crustacean crab) {
		System.out.println(this.getTag() + " loves eating crabs!");
	}
}
	
=======
package com.revature.ocean;

public class Turtle extends SeaCreature implements Air {

	public static int population = 0;	
	
	public Turtle(String tag, String size, int travel) {
		super(tag, size, travel);
		population++;
	}
	
	public Turtle(String tag, String size) {
		this(tag, size, 1842);
	}
	
	public Turtle(String tag) {
		this(tag, "3 feet 6 inches");
	}
	
	public Turtle() {
		this("Lal"); // attempting to look for a default
	}

	public void breathing() {
		System.out.println(" takes in a breath on surface and dives underwater.");

	}

	@Override
	public void diet() {
		System.out.println(this.getTag() + " prefers sea grass.");

	}

	@Override
	public void reproduce() {
		System.out.println(this.getTag() + " lays eggs on beach.");

	}
	
	public void diet(Fish fish) {
		System.out.println(this.getTag() + " prefers hunting fish.");
	}
	
	public void diet(Crustacean crab) {
		System.out.println(this.getTag() + " loves eating crabs!");
	}
}
	
>>>>>>> b26c323e7c870b45cd15450379f73aaaccd625ed:src/main/java/com/revature/ocean/Turtle.java
