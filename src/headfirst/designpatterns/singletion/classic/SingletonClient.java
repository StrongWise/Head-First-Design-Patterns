package headfirst.designpatterns.singletion.classic;

/**
 * description :
 */
public class SingletonClient {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}
