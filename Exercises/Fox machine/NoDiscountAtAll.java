/**
 *
 * @author estefaniapitolmartinez
 */
public class NoDiscountAtAll implements Discount {
    @Override
    public void calculateDiscount(String amount) {
        System.out.println("Applying No Discount At All on the " + amount + " price.");
    }
}