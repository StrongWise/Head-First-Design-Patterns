package headfirst.designpatterns.observer.weather;

/**
 * description :
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
