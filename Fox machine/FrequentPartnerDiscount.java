/**
 *
 * @author estefaniapitolmartinez
 */
public class FrequentPartnerDiscount implements Discount {
    @Override
    public void calculateDiscount(String amount) {
        System.out.println("Applying Frequent Partner Discount on the " + amount + " price.");
    }
}