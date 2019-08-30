package com.revature.ocean;

import java.util.Comparator;


 // comparing the travel distance of two sharks
public class DistanceTravel implements Comparator<Shark> {

	public int compare(Shark o1, Shark o2) {
		int out = 0;
		int sharkOneMiles = o1.getTravel();
		int sharkTwoMiles = o2.getTravel();
		out = (int) (sharkOneMiles - sharkTwoMiles);
			if (out == 0) {
				out = o1.compareTo(o2);
			}
		return out;
	}
	
}
