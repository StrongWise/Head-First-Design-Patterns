package headfirst.designpatterns.strategy;

/**
 * description :
 */
public class DecoyDuck extends Duck {
    public void quack() {
        // do nothing
    }

    void display() {
        System.out.println("I'm a duck Decoy");
    }

    public void fly() {
        // do nothing
    }
}
