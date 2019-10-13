/**
 *
 * @author estefaniapitolmartinez
 */
public class TestBaguetteShop {
    public static void main(String args[]) {
        BaguetteFactory pueblaStore = new BaguetteFactoryPuebla();
        BaguetteFactory monterreyStore = new BaguetteFactoryMonterrey();
        BaguetteFactory guadalajaraStore = new BaguetteFactoryGuadalajara();
        BaguetteFactory yucatanStore = new BaguetteFactoryYucatan();
        pueblaStore.name();
        monterreyStore.name();
        guadalajaraStore.name();
        yucatanStore.name();

        System.out.println();

        Baguette spanishPuebla = pueblaStore.create(1).order();
        spanishPuebla.name();
        System.out.println();
        Baguette italianPuebla = pueblaStore.create(2).order();
        italianPuebla.name();
        System.out.println();
        Baguette mexicanPuebla = pueblaStore.create(3).order();
        mexicanPuebla.name();
        System.out.println();
        Baguette romanPuebla = pueblaStore.create(4).order();
        romanPuebla.name();

        System.out.println();

        Baguette spanishMonterrey = monterreyStore.create(1).order();
        spanishMonterrey.name();
        System.out.println();
        Baguette italianMonterrey = monterreyStore.create(2).order();
        italianMonterrey.name();
        System.out.println();
        Baguette mexicanMonterrey = monterreyStore.create(3).order();
        mexicanMonterrey.name();
        System.out.println();
        Baguette romanMonterrey = monterreyStore.create(4).order();
        romanMonterrey.name();

        System.out.println();

        Baguette spanishGuadalajara = guadalajaraStore.create(1).order();
        spanishGuadalajara.name();
        System.out.println();
        Baguette italianGuadalajara = guadalajaraStore.create(2).order();
        italianGuadalajara.name();
        System.out.println();
        Baguette mexicanGuadalajara = guadalajaraStore.create(3).order();
        mexicanGuadalajara.name();
        System.out.println();
        Baguette romanGuadalajara = guadalajaraStore.create(4).order();
        romanGuadalajara.name();

        System.out.println();

        Baguette spanishYucatan = yucatanStore.create(1).order();
        spanishYucatan.name();
        System.out.println();
        Baguette italianYucatan = yucatanStore.create(2).order();
        italianYucatan.name();
        System.out.println();
        Baguette mexicanYucatan = yucatanStore.create(3).order();
        mexicanYucatan.name();
        System.out.println();
        Baguette romanYucatan = yucatanStore.create(4).order();
        romanYucatan.name();
    }
}