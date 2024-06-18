package headfirst.designpatterns.decorator.starbuzz;

/**
 * description :
 */
public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf Coffee";
	}

	public double cost() {
		return 1.05 + super.cost();
	}
}
