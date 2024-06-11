package headfirst.designpatterns.strategy;

/**
 * description :
 */
public abstract class Duck {
    public void quack() {
		System.out.println("Quack");
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    abstract void display();
}
