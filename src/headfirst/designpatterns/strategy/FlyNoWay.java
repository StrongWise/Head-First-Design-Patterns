package headfirst.designpatterns.strategy;

import headfirst.origin.strategy.FlyBehavior;

/**
 * description :
 */
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
