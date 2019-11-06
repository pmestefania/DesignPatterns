/**
 *
 * @author estefaniapitolmartinez
 */
import java.util.ArrayList;

public class PressureForecast implements Observer, Display {    
    private Double pressure;
    private TireData tireData;

    public PressureForecast(TireData td) {
        tireData = td;
        tireData.addObserver(this);
    }

    @Override
    public void update() {
        pressure = tireData.getPressure();
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("Pressure Forecast");
        System.out.println("Current pressure: " + pressure);
        System.out.println();
    }
}