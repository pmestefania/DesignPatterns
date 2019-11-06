/**
 *
 * @author estefaniapitolmartinez
 */
import java.util.ArrayList;

public class TireData implements Subject {    
    private Double pressure, humidity, temperature;
    private ArrayList<Observer> observers;

    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update();
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers == null) {
            observers = new ArrayList<Observer>();
        }
        observers.remove(o);
    }

    @Override
    public void addObserver(Observer o) {
        if(observers == null) {
            observers = new ArrayList<Observer>();
        }
        observers.add(o);
    }

    @Override
    public void valuesChanged() {
        notifyObservers();
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setPressure(Double p) {
        pressure = p;
        valuesChanged();
    }

    public void setHumidity(Double h) {
        humidity = h;
        valuesChanged();
    }

    public void setTemperature(Double t) {
        temperature = t;
        valuesChanged();
    }
}