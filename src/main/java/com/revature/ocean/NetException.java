package com.revature.ocean;

public class NetException extends RuntimeException {

	// unchecked exception - one sample of a throw exception from SeaCreature.setTravel() 
	public NetException() {
		super("Sea creatures do not travel in negative miles.");
	}

	public NetException(String message) {
		super(message);
		
	}
}
