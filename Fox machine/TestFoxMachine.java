/**
 *
 * @author estefaniapitolmartinez
 */
public class TestFoxMachine{
    public static void main(String args[]) {
        Printer printerOne = new PrinterOne();
        printerOne.setPrice("PrinterOnePrice");
        printerOne.setDiscount(new FivePercentDiscount());
        printerOne.showPrinter();

        System.out.println();

        Printer printerTwo = new PrinterTwo();
        printerTwo.setPrice("PrinterTwoprice");
        printerTwo.setDiscount(new ReduceFixedAmountDiscount());
        printerTwo.showPrinter();

        System.out.println();

        printerOne.setDiscount(new FrequentPartnerDiscount());
        printerOne.showPrinter();

        System.out.println();

        printerTwo.setDiscount(new NoDiscountAtAll());
        printerTwo.showPrinter();
    }
}