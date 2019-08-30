package com.revature.ocean;

import java.io.IOException;
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
 * - Adding more creatures and parameters
 *  
 * 
 * Idea comes from https://www.ocearch.org/
 *  
 * @author Efrain Vila
 *
 */
public class OceanDriver {

	public static void main(String[] args) throws IOException {
		System.out.println("OceanDriver found : " + new Shark("Ema","6 feet 3 inches,", 297)); 
		System.out.println("Current Log of Sea Creatures");
		System.out.println(new Shark("Pico", "7 feet 5 inches", 15624));
		System.out.println(new Turtle("Lal", "3 feet 6 inches", 1842));
		System.out.println(new Shark("Laura","9 feet 3 inches", 702));  
		System.out.println(new Turtle("Thesis", "2 feet 3 inches", 7889)); 
		
		
		Turtle t = new Turtle("Harmony");
		t.reproduce();
		
		Shark s = new Shark("Lando");
		s.diet();
		
		Turtle t1 = new Turtle("Andrea", "3 feet 9 inches", 683);
		t1.diet();
		
		System.out.println(t.getTag()+ " has traveled " + t.getTravel() + " miles");
		System.out.println(t1.getTag()+ " has traveled " + t1.getTravel() + " miles");
		
		//overloaded method
		t.diet(new Fish());
		s.diet(new Human());
		
		//static variable
		System.out.println("The number of sharks in the log is currently at : "+ Shark.population);
		
		//collection mode
		System.out.println("Shark Logs by Travel Distance");
		sharkHerd(); // heard is a group of sharks
		
		System.out.println("Turtle Logs");
		turtleBale(); //bale is a group of turtles
		
		
	}
	
	//shark array
	private static void sharkHerd() {
		List<Shark> sharkList = new ArrayList<Shark>();
		sharkList.add(new Shark("Jon", "8 feet 7 inches", 373));
		sharkList.add(new Shark("Chancellor", "6 feet 4 inches", 4436));
		sharkList.add(new Shark("Gareth", "10 feet 4 inches", 500)); // empty miles 500
		sharkList.add(new Shark("Sero", "11 feet 2 inches", 250)); // empty miles 250
		
		
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
		// checked exception
		
		 try {
		 
		 } catch(ArrayStoreException e) { //could be used for string being inputed into int miles parameter
			 System.out.println("The information provide is of the wrong type." + e.getMessage());
		 }
		 
	}	
		
		
	//turtle array
	private static void turtleBale() throws IOException {
		List<Turtle> turtleList = new ArrayList<Turtle>();
		turtleList.add(new Turtle("Kate", "3 feet 8 inches", 1994));
		turtleList.add(new Turtle("Polymnia", "2 feet 6 inches", 3316));
		turtleList.add(new Turtle("Holly", "3 feet 6 inches"));
		turtleList.add(new Turtle("Melanie", "4 foot 1 inches", 940)); // can not skip begining/middle parameters, must create another constructor
		
		for(Turtle turtleGuide : turtleList) {
			System.out.println(turtleGuide);
		}
		// unchecked exception for turtle - need to re-check handling
		try {
			
		}	catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Some turtles ate a part of the log and the elements have fallen out of bounds. Oops.");
			e.printStackTrace();
		}
		
	}
		
		
		
		
		
}
