package headfirst.designpatterns.strategy;

/**
 * description :
 */
public class RubberDuck extends Duck implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }

    void display() {
        System.out.println("I'm a rubber duckie");
    }
}
