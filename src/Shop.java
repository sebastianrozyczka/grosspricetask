public class Shop {
    public static void main(String[] args) {
        ProductCreator productCreator = new ProductCreator();
        PriceCalculator priceCalculator = new PriceCalculator();

        Product[] emptyTable = productCreator.createTable();
        Product[] completedTable = productCreator.create(emptyTable);

        priceCalculator.calculateSumOfGrossPricesForOneCategory(completedTable);

    }
}
