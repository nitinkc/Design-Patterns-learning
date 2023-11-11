package com.deisgnpatterns.D4Structural.S1Decorator.beverageApp;

import com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.concreteComponents.DarkRoast;
import com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.concreteComponents.HouseBlend;
import com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.concreteDecorators.Milk;
import com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.concreteDecorators.SoyMilk;
import com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.concreteDecorators.Sugar;

/**

 * 
 * 		- our goal is to allow classes to be easily extended with new behavior without
 * 				modifying existing code
 * 		- it is good -> FLEXIBLE !!!  if the requirements are changing we do not have to
 * 							rewrite the whole application 
 * 
 * 		- applying the open-closed principle everywhere can lead to hard-to-understand code !!!
 *
 * 	DECORATOR PATTERN HELPS TO MAKE OPEN CLOSED PRINCIPLE COME TRUE
 * 
 * 			---------------------------------------------------------------------------------------			
 * 
 * 		Decorator Pattern: attaches additional responsibilities to an object dynamically !!!
 *			Decorators provide a flexible alternative to
 *			  subclassing for extending functionality
 *
 *		For example: new LineNumberInputStream(new BufferedInputStream(new FileInputStream()));
 */

public class App {

	public static void main(String[] args) {

		System.out.println("Plain beverage : $5.0");
		System.out.println("Dark Roast : $5.5");
		System.out.println("Espresso : $6.0");
		System.out.println("Decaf : $4.5");

		System.out.println("Milk : $1.50");
		System.out.println("Soy Milk : $2.50");
		System.out.println("Sugar : $0.50");
		System.out.println("--------------------------");


		//Milk with two Sugar
		Beverage milkWith2Sugars = new Sugar(new Sugar(new Milk(new HouseBlend())));
		System.out.println(milkWith2Sugars.getDescription() + " ## Total Cost: " + milkWith2Sugars.getCost());

		Beverage milkWithSugar = new Sugar(new Milk(new HouseBlend()));
		milkWithSugar = new Milk(new Sugar(new HouseBlend()));//Order doesn't matter
		System.out.println(milkWithSugar.getDescription() + " ## Total Cost: "  + milkWithSugar.getCost());

		Beverage plainBeverage = new HouseBlend();
		System.out.println(plainBeverage.getDescription() + " ## Total Cost: "  + plainBeverage.getCost());

		Beverage beverageWithMilk = new Milk(new HouseBlend());
		System.out.println(beverageWithMilk.getDescription() + " ## Total Cost: " + beverageWithMilk.getCost());

		Beverage darkRoastWithSoyMilk2Sugar = new DarkRoast();
		darkRoastWithSoyMilk2Sugar = new SoyMilk(darkRoastWithSoyMilk2Sugar);
		darkRoastWithSoyMilk2Sugar = new Sugar(darkRoastWithSoyMilk2Sugar);
		darkRoastWithSoyMilk2Sugar = new Sugar(darkRoastWithSoyMilk2Sugar);
		System.out.println(darkRoastWithSoyMilk2Sugar.getDescription() + " ## Total Cost: " + darkRoastWithSoyMilk2Sugar.getCost());




	}
}
