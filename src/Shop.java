public class Shop {
    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator();
        Category[] categories = new Category[2];
        Product[] products = new Product[2];

        categories[0] = new Category("Leki", 0.08 );
        categories[1] = new Category("Alkohol", 0.23);

        products[0] = new Product("Apap", "Tabletki przeciwbólowe", 1, categories[0]);
        products[1] = new Product("Piwo", "Alk. 5.0%", 3, categories[1]);

        priceCalculator.calculateGrossPrice(products[0]);
        priceCalculator.calculateGrossPrice(products[1]);
    }
}
