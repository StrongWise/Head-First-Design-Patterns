package headfirst.origin.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}
