/**
 *
 * @author estefaniapitolmartinez
 */
public interface Subject {
    public void notifyObservers();
    public void removeObserver(Observer o);
    public void addObserver(Observer o);
    public void valuesChanged();
}