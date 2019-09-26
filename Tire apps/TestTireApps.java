/**
 *
 * @author estefaniapitolmartinez
 */
public class TestTireApps {
    public static void main(String args[]) {
        TireData tireData = new TireData();
        PressureStatistics pressureStatistics = new PressureStatistics(tireData);
        PressureForecast pressureForecast = new PressureForecast(tireData);
        TireStats tireStats = new TireStats(tireData);

        tireData.addObserver(pressureStatistics);
        tireData.addObserver(pressureForecast);
        tireData.addObserver(tireStats);

        tireData.setPressure(0.0);
        tireData.setHumidity(0.0);
        tireData.setTemperature(0.0);
        tireData.valuesChanged();

        pressureStatistics.display();
        System.out.println();
        pressureForecast.display();
        System.out.println();
        tireStats.display();
        System.out.println();
        
        tireData.setPressure(10.0);
        tireData.setHumidity(10.0);
        tireData.setTemperature(10.0);
        tireData.valuesChanged();

        pressureStatistics.display();
        System.out.println();
        pressureForecast.display();
        System.out.println();
        tireStats.display();
        System.out.println();   

        tireData.setPressure(5.0);
        tireData.setHumidity(5.0);
        tireData.setTemperature(5.0);
        tireData.valuesChanged();

        pressureStatistics.display();
        System.out.println();
        pressureForecast.display();
        System.out.println();
        tireStats.display();
        System.out.println();   
    }
}