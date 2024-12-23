package headfirst.designpatterns.singletion.chocolate;

/**
 * description :
 */
public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        System.out.println("boiler.isEmpty() = " + boiler.isEmpty());
        System.out.println("boiler.isBoiled() = " + boiler.isBoiled());
        boiler.fill();
        System.out.println();
        System.out.println("boiler.isEmpty() = " + boiler.isEmpty());
        System.out.println("boiler.isBoiled() = " + boiler.isBoiled());
        boiler.boil();
        System.out.println();
        System.out.println("boiler.isEmpty() = " + boiler.isEmpty());
        System.out.println("boiler.isBoiled() = " + boiler.isBoiled());
        boiler.drain();
        System.out.println();
        System.out.println("boiler.isEmpty() = " + boiler.isEmpty());
        System.out.println("boiler.isBoiled() = " + boiler.isBoiled());

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        System.out.println("boiler = " + boiler + ", boiler2 = " + boiler2);
    }
}
