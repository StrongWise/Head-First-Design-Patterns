package headfirst.designpatterns.strategy;

/**
 * description :
 */
public class MallardDuck extends Duck implements QuackBehavior, FlyBehavior {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("저는 물오리입니다");
    }
    public void fly() {
		System.out.println("I'm flying!!");
    }
}
