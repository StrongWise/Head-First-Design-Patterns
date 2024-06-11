package headfirst.designpatterns.strategy;

/**
 * description :
 */
public class MallardDuck extends Duck implements Quackable, Flyable {
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
    public void fly() {
		System.out.println("I'm flying!!");
    }
}
