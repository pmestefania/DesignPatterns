/**
 *
 * @author estefaniapitolmartinez
 */
public class FivePercentDiscount implements Discount {
    @Override
    public void calculateDiscount(String amount) {
        System.out.println("Applying Five Percent Discount on the " + amount + " price.");
    }
}