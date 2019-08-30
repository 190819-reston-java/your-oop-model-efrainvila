package com.revature.ocean;

public class NetException extends RuntimeException {

	// unchecked exeception - one sample of a throw exception from SeaCreature.setTravel() 
	public NetException() {
		super("Sea Creature do not travel in negative miles");
	}

	public NetException(String message) {
		super(message);
		
	}
}
