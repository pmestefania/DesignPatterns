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

        tireData.setPressure(15.0);
        tireData.setHumidity(15.0);
        tireData.setTemperature(15.0);

        pressureStatistics.display();
        pressureForecast.display();
        tireStats.display();
        
        tireData.setPressure(5.0);
        tireData.setHumidity(5.0);
        tireData.setTemperature(5.0);

        pressureStatistics.display();
        pressureForecast.display();
        tireStats.display();   

        tireData.setPressure(10.0);
        tireData.setHumidity(10.0);
        tireData.setTemperature(10.0);

        pressureStatistics.display();
        pressureForecast.display();
        tireStats.display();   
    }
}