package headfirst.designpatterns.decorator.starbuzz;

/**
 * description :
 */
public abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
