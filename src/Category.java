public enum Category {
    LEKI("Leki", 0.08),
    ALKOHOL("Alkohol", 0.23),
    SLODYCZE("Słodycze", 0.23);

    private String name;
    private double vat;

    Category(String name, double vat) {
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
