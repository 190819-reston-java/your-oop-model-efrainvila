package com.revature.ocean;
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
		System.out.println("OceanDriver finds a : " + new Shark());
		System.out.println(new Shark());
		System.out.println(new Turtle());
		
		
		

	}

}
