import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceCalculator {
    public void calculateGrossPrice(Product product) {
        switch (product.getCategory().getName()){
            case "Leki":
                System.out.println("Cena brutto produktu z kategorii leki: " + product.getName()
                        + " to: " + roundPrice(product.getNetPrice() * (product.getCategory().getVat() + 1)));
                break;
            case "Alkohol":
                System.out.println("Cena brutto produktu z kategorii alkohol: " + product.getName()
                        + " to: " +  roundPrice(product.getNetPrice() * (product.getCategory().getVat() + 1)));
        }
    }

    private double roundPrice(double number) {
       return new BigDecimal(number)
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
