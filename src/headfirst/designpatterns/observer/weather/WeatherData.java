package headfirst.designpatterns.observer.weather;

/**
 * description :
 */
public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;
    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private HeatIndexDisplay heatIndexDisplay;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        heatIndexDisplay.update(temp, humidity, pressure);
    }
}
