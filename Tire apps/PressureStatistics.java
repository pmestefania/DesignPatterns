/**
 *
 * @author estefaniapitolmartinez
 */
import java.util.ArrayList;

public class PressureStatistics implements Observer, Display {    
    private Double acumPressure = 0.0, acumCaptures = 0.0, minPressure = 0.0, maxPressure = 0.0;
    private TireData tireData;

    public PressureStatistics(TireData td) {
        tireData = td;
        tireData.addObserver(this);
    }

    @Override
    public void update() {
        Double pressure = tireData.getPressure();
        if(pressure < minPressure)
            minPressure = pressure;
        if(pressure > maxPressure)
            maxPressure = pressure;
        acumPressure += pressure;
        acumCaptures++;
    }

    @Override
    public void display() {
        System.out.println("Pressure Statistics");
        System.out.println("Average: " + acumPressure / acumCaptures);
        System.out.println("Min: " + minPressure);
        System.out.println("Max: " + maxPressure);
    }
}