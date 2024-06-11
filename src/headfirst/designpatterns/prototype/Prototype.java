package headfirst.designpatterns.prototype;

/**
 * description : temp
 */
public class Prototype {
    public Prototype copy() throws CloneNotSupportedException {
        Object clone = clone();
        return (Prototype) clone;
    }
}
