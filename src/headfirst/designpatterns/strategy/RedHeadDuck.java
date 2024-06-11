package headfirst.designpatterns.strategy;

/**
 * description :
 */
public class RedHeadDuck extends Duck implements Quackable, Flyable {
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
    public void fly() {
		System.out.println("I'm flying!!");
    }
}
