package com.revature.ocean;

import java.util.ArrayList;
import java.util.List;

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
		System.out.println("OceanDriver found : " + new Shark("Ema","6 feet 3 inches,", 297)); 
		System.out.println("Log of Sea Creatures");
		System.out.println(new Shark("Laura","9 feet 3 inches", 702));  // want to add listing of all known sharks
		System.out.println(new Turtle("Thesis", "2 feet 3 inches", 7889)); // want to add listing of all known turtles
		
		
		Turtle t = new Turtle();
		t.reproduce();
		
		Shark s = new Shark();
		s.diet();
		
		Turtle t1 = new Turtle("Andrea", "3 feet 9 inches", 683);
		t1.diet();
		
		System.out.println(t.getTravel() + " miles");
		System.out.println(t1.getTravel() + " miles");
		
		//overloaded method
		t.diet(new Fish());
		s.diet(new Human());
		
		//static variable
		System.out.println(Shark.population);
		
		//collection mode
		sharkHerd();
		
		
	}

	private static void sharkHerd() {
		List<Shark> sharkList = new ArrayList<Shark>();
		sharkList.add(new Shark("Jon", "8 feet 7 inches", 373));
		sharkList.add(new Shark("Chancellor", "6 feet 4 inches", 4436));
		sharkList.add(new Shark("Gareth", "10 feet 4 inches"));
		sharkList.add(new Shark("Sero", "11 feet 2 inches"));
		
		for(Shark sharkGuide : sharkList) {
			System.out.println(sharkGuide);
		}
		
		//System.out.println(sharkList);
		
		
		
	}

	

}
