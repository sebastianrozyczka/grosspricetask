import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PriceCalculator {
    private ProductCreator productCreator = new ProductCreator();
    private Scanner scanner = new Scanner(System.in);

    public void calculateSumOfGrossPricesForOneCategory(Product[] products) {
        System.out.println("Podaj nazwę kategorii dla której obliczyć sumę cen brutto: ");
        System.out.println("1 - leki");
        System.out.println("2 - alkohol");
        System.out.println("3 - słodycze");
        int option = scanner.nextInt();
        Category actualCategory = productCreator.chooseCategory(option);
        double sum = 0;
        for(Product product : products){
            if(product.getCategory().equals(actualCategory)) {
                sum += calculateGrossPrice(product);
            }
        }
        System.out.println(sum);
    }

    private double calculateGrossPrice(Product product) {
        return roundPrice(product.getNetPrice() * (product.getCategory().getVat() + 1));
    }

    private double roundPrice(double number) {
       return new BigDecimal(number)
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
