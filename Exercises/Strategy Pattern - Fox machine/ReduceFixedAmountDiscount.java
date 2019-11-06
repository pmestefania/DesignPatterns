/**
 *
 * @author estefaniapitolmartinez
 */
public class ReduceFixedAmountDiscount implements Discount {
    @Override
    public void calculateDiscount(String amount) {
        System.out.println("Applying Reduce Fixed Amount Discount on the " + amount + " price.");
    }
}