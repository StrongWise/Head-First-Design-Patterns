package headfirst.designpatterns.decorator.starbuzz;

/**
 * description :
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
    public double cost() {
        return .89 + super.cost();
    }
}
