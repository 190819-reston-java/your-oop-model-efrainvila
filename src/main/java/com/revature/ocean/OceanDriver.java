package com.revature.ocean;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Domain planned: Ocean 
 * Abstract : SeaCreatures - all life forms that inhabit the ocean domain
 * Interface : Air - turtles can breath with lungs, sharks directly from water with gills
 * Concrete Classes : Shark, Turtle
 * Implementation :  Turtle implements Air 
 * Methods :  Breathing from interface, all others from abstract class SeaCreature : Swim, Diet, Reproduce
 * Fields : string tag, string size, int travel 
 * Comparable : string size (turtle) but shark can be also compared making SeaCreature iterable
 * Comparator : int travel (sharks)	
 * Exceptions : throw to NetException (travel), IndexOutOfBoundsException (turtle)
 * 
 * Possible Future Implementations
 * ----------------------
 * - Need to add a checked exception
 * - Allow user input data
 * - Adding more creatures types
 * - Add parameter boolean gender (True for female - False for male)
 * - Convert size from String to Int
 * 
 * Idea comes from https://www.ocearch.org/
 *  
 * @author Efrain Vila
 *
 */
public class OceanDriver {


	public static void main(String[] args) {
		
		Shark s = new Shark("Shayna");
		s.diet();
		s.swim();
		s.reproduce();
		System.out.println("");
		
		Turtle t1 = new Turtle("Andrea", "3 feet 9 inches", 683);
		t1.diet();
		t1.breathing();
		System.out.println(t1.getTag()+ " has traveled " + t1.getTravel() + " miles");
		System.out.println("");
		
		Turtle t = new Turtle("Harmony");
		t.reproduce();
		System.out.println(t.getTag()+ " has traveled " + t.getTravel() + " miles");	
		System.out.println("");
		
		//overloaded
		t1.diet(new Fish()); // changes "Andrea" diet from sea grass to fish
		s.diet(new Human()); // changes "Shayna" diet from turtle to human
		System.out.println("");
		
		//throwing exception
		//Shark s2 = new Shark("Brunswich", "8 feet 9 inches", 3438); //-
		//s2.setTravel(-3438); // can not have negative number //-
		
		
		
		System.out.println("Shark Listing by Travel Distance");
		System.out.println("--------------------------------");
		sharkHerd(); // herd is a group of sharks
		
		System.out.println("");
		System.out.println("Turtle Listing by Size");
		System.out.println("----------------------");
		turtleBale(); // bale is a group of turtles		
	}
	
	//shark array
	private static void sharkHerd() {
		List<Shark> sharkList = new ArrayList<Shark>();
		sharkList.add(new Shark("Ema","6 feet 3 inches,", 297));
		sharkList.add(new Shark("Pico", "7 feet 5 inches", 15624));
		sharkList.add(new Shark("Laura","9 feet 3 inches", 702));
		sharkList.add(new Shark("Jon", "8 feet 7 inches", 373));
		sharkList.add(new Shark("Chancellor", "6 feet 4 inches", 4436));
		sharkList.add(new Shark("Gareth", "10 feet 4 inches", 500)); // empty miles added 500
		sharkList.add(new Shark("Sero", "11 feet 2 inches", 250)); // empty miles added 250
					
		SortedSet<Shark> travelSharkDistance = new TreeSet<Shark>(new DistanceTravel()); // sorting sharkList
			travelSharkDistance.addAll(sharkList);
		
			for(Shark sharkGuide : travelSharkDistance) {
				System.out.println(sharkGuide);
			}
		//static variable
		System.out.println("The number of sharks in the listing is currently at : "+ Shark.population);

	}	
	
	//turtle array
	private static void turtleBale() { 
		List<Turtle> turtleList = new ArrayList<Turtle>();
		turtleList.add(new Turtle("Lal", "3 feet 6 inches", 1842));
		turtleList.add(new Turtle("Thesis", "2 feet 3 inches", 7889));
		turtleList.add(new Turtle("Kate", "3 feet 8 inches", 1994));
		turtleList.add(new Turtle("Polymnia", "2 feet 6 inches", 3316));
		turtleList.add(new Turtle("Holly", "3 feet 7 inches", 621));
		turtleList.add(new Turtle("Melanie", "4 feet 1 inches", 940)); // can not skip beginning/middle parameters, must create another constructor
		
		SortedSet<Turtle> turtleSort = new TreeSet<Turtle>(turtleList);
			for(Turtle turtleGuide : turtleSort) {
				System.out.println(turtleGuide);
			}
		
		// exception for turtle - need to re-check handling	
			try {
				int j = 1;
				for(int i = 0; i < turtleList.size(); i++) {
					//turtleList.get(j); //-
					j++;
				}
					
			}	catch (IndexOutOfBoundsException e){
				System.out.println(" ** A turtle ate a part of the array list and the elements have fallen out of bounds. Oops. **");
				e.printStackTrace();
				return;
			}
			//static variable
			System.out.println("The number of turtle in the listing is currently at : "+ Turtle.population);
	}
			
		
}
