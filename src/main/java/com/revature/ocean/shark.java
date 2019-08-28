package com.revature.ocean;

public class shark extends SeaCreature implements Air {

	public shark(String tag, String size, boolean predator) {
		super(tag, size, predator);
		// TODO Auto-generated constructor stub
	}

	public void breathing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void diet() {
		System.out.println("hunts for food");

	}

	@Override
	public void reproduce() {
		System.out.println("only 1 offspring survives");

	}

}
