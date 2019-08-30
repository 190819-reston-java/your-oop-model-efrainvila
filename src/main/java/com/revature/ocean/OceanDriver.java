package com.revature.ocean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Domain planned: Ocean 
 * Abstract : SeaCreatures - all life forms that inhabit the ocean domain
 * Interface : Air - some creatures can breath with lungs, others directly from water
 * Concrete examples : Shark, Turtle 	(other creatures - FI)
 * Methods :  Breathing, Swim, Diet, Reproduce	(add parameter boolean gender - FI)
 * Strings : tag, size	 (may need to convert size to int - FI), travel
 * Comparable : travel
 * Sort : travel 	(size if converted to int, gender if added - FI)
 * Exceptions : throw to NetException,
 * 
 * Possible Future Implementations
 * ----------------------
 * - Allow user input data
 * 
 *  
 * 
 * Idea comes from https://www.ocearch.org/
 *  
 * @author Efrain Vila
 *
 */
public class OceanDriver {

	public static void main(String[] args) {
		System.out.println("OceanDriver found : " + new Shark("Ema","6 feet 3 inches,", 297)); 
		System.out.println("Log of Sea Creatures");
		System.out.println(new Shark("Pico", "7 feet 5 inches", 15624));
		System.out.println(new Turtle("Lal", "3 feet 6 inches", 1842));
		System.out.println(new Shark("Laura","9 feet 3 inches", 702));  
		System.out.println(new Turtle("Thesis", "2 feet 3 inches", 7889)); // future idea : add listing of all known creature etc.
		
		
		Turtle t = new Turtle("Lal");
		t.reproduce();
		
		Shark s = new Shark("Pico");
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
		System.out.println("Shark Logs by Travel Distance");
		sharkHerd(); // heard is a group of sharks
		
		System.out.println("Turtle Logs");
		turtleBale(); //bale is a group of turtles
		
		
	}
	
	//shark
	private static void sharkHerd() {
		List<Shark> sharkList = new ArrayList<Shark>();
		sharkList.add(new Shark("Jon", "8 feet 7 inches", 373));
		sharkList.add(new Shark("Chancellor", "6 feet 4 inches", 4436));
		sharkList.add(new Shark("Gareth", "10 feet 4 inches", 500)); // empty miles
		sharkList.add(new Shark("Sero", "11 feet 2 inches", 250)); // empty miles
		
		
		Iterator<Shark> sharkIterator = sharkList.iterator();
			while(sharkIterator.hasNext()) {
				Shark sh = sharkIterator.next();
				//System.out.println(sh);
			}
		
		// sorting sharkList		
		SortedSet<Shark> travelSharkDistance = new TreeSet<Shark>(new DistanceTravel()); // sharks works need to try turtle
			travelSharkDistance.addAll(sharkList);
		
		// System.out.println("**checking travel distance**");
			for(Shark sharkGuide : travelSharkDistance) {
				System.out.println(sharkGuide);
			}
		
	}	
		
		
	
	//turtle
	private static void turtleBale() {
		List<Turtle> turtleList = new ArrayList<Turtle>();
		turtleList.add(new Turtle("Kate", "3 feet 8 inches", 1994));
		turtleList.add(new Turtle("Polymnia", "2 feet 6 inches", 3316));
		turtleList.add(new Turtle("Holly", "3 feet 6 inches"));
		turtleList.add(new Turtle("Melanie", "4 foot 1 inches", 940)); // can not skip begining/middle parameters, must create another constructor
		
		for(Turtle turtleGuide : turtleList) {
			System.out.println(turtleGuide);
		}
	}
		
	
		
		
	}
