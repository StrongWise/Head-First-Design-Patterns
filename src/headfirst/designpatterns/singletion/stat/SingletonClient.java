package headfirst.designpatterns.singletion.stat;

/**
 * description :
 */
public class SingletonClient {
    public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
    }
}
