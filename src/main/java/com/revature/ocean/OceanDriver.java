package com.revature.ocean;

import java.io.ObjectInputStream.GetField;

/**
 * Domain planned: Ocean 
 * Abstract : SeaCreatures
 * Interface : Air
 * Concrete examples : Shark, Turtle 
 * Methods :  Breathing, Swim, Diet, Reproduce
 * Strings : tag, size, travel  
 * 
 * idea comes from https://www.ocearch.org/
 *  
 * @author Efrain Vila
 *
 */
public class OceanDriver {

	public static void main(String[] args) {
		System.out.println("OceanDriver found : " + new Shark()); // want to only include tag id
		System.out.println("Log of Sea Creatures");
		System.out.println(new Shark());  // want to add listing of all known sharks
		System.out.println(new Turtle()); // want to add listing of all known turtles
		
		
		SeaCreature t = new Turtle();
		t.reproduce();
		
		SeaCreature s = new Shark();
		s.diet();
		
		
		
		
		
		
		

	}

}
