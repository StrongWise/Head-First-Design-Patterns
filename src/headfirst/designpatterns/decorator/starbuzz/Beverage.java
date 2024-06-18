package headfirst.designpatterns.decorator.starbuzz;

/**
 * description :
 */
public class Beverage {
    String description = "Unknown Beverage";
    boolean milk = false;
    boolean soy = false;
    boolean mocha = false;
    boolean whip = false;

    public String getDescription() {
        return description;
    }

    public double cost() {
        double result = 0;
        if (hasMilk()) {
            result += 0.10;
        }
        if (hasSoy()) {
            result += 0.10;
        }
        if (hasMocha()) {
            result += 0.20;
        }
        if (hasWhip()) {
            result += 0.10;
        }
        return result;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
