/**
 *
 * @author estefaniapitolmartinez
 */
import java.util.ArrayList;

public class PressureStatistics implements Observer, Display {    
    private Double acumPressure = 0.0, acumCaptures = 0.0, minPressure, maxPressure;
    private TireData tireData;

    public PressureStatistics(TireData td) {
        tireData = td;
        tireData.addObserver(this);
    }

    @Override
    public void update() {
        Double pressure = tireData.getPressure();

        if(minPressure == null && maxPressure == null)
            minPressure = maxPressure = pressure;
        if(pressure < minPressure)
            minPressure = pressure;
        if(pressure > maxPressure)
            maxPressure = pressure;

        acumPressure += pressure;
        acumCaptures++;
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("Pressure Statistics");
        System.out.println("Average: " + acumPressure / acumCaptures);
        System.out.println("Min: " + minPressure);
        System.out.println("Max: " + maxPressure);
        System.out.println();
    }
}