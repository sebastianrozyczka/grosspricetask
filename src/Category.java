public class Category {
    private String name;
    private double vat;

    public Category(String name, double vat) {
        this.name = name;
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }


}
