/**
 *
 * @author estefaniapitolmartinez
 */
public abstract class Printer {
    protected Discount discount;
    protected String price;

    public abstract void display();
    
    public void setDiscount(Discount d){
        discount = d;
    }

    public void setPrice(String p) {
        price = p;
    }
    
    public void showDiscount(){
       discount.calculateDiscount(price);
    }
    
    public void showPrinter(){
        display();
        showDiscount();
    }
}