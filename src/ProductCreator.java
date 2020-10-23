import java.util.Scanner;

public class ProductCreator {
    private Scanner scanner = new Scanner(System.in);
    public Product[] createTable() {
        System.out.println("Podaj ilość produktów, które należy dodać do sklepu: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine();

        return new Product[arraySize];
    }

    public Product[] create(Product[] products) {
        System.out.println("Podaj podstawowe dane produktów: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Produkt " + i + ": ");
            System.out.println("Podaj nazwę produktu: ");
            String name = scanner.nextLine();
            System.out.println("Podaj opis produktu: ");
            String description = scanner.nextLine();
            System.out.println("Podaj cenę netto produktu: ");
            double netPrice = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Wybierz kategorię: ");
            System.out.println("1 - leki");
            System.out.println("2 - alkohol");
            System.out.println("3 - słodycze");
            Category category = chooseCategory(scanner.nextInt());
            scanner.nextLine();
            products[i] = new Product(name, description, netPrice, category);
        }
        return products;
    }

    public Category chooseCategory(int option) {
        return switch (option) {
            case 1 -> Category.LEKI;
            case 2 -> Category.ALKOHOL;
            case 3 -> Category.SLODYCZE;
            default -> Category.NONE;
        };
    }
}
