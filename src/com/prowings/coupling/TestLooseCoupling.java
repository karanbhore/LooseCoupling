package com.prowings.coupling;

public class TestLooseCoupling {

	public static void main(String[] args) {
		
		Plane plane=new Plane();
		Car car=new Car();
		
		Traveller traveller=new Traveller(car);
		
		traveller.startJourney(plane);
	}
}
