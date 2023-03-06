package school;

public class Furniture {
    private int cost;
    private boolean underWarranty;
    public Furniture(int cost, boolean underWarranty) {
        this.cost = cost;
        this.underWarranty = underWarranty;
    }

    public int getCost() { return cost; }
    public boolean getUnderWarranty() { return underWarranty; }

    @Override
    public boolean equals(Object o) {
        return o == this;
    }

    @Override
    public String toString() {
        return "this is just the baseclass Furniture";
    }
}
