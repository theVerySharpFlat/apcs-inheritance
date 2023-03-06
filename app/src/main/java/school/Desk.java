package school;

public class Desk extends Furniture {
    private int surfaceArea;
    private String name;

    public Desk(String name, int surfaceArea) {
        super(150, false);
        this.surfaceArea = surfaceArea;
        this.name = name;
    }

    public int getSurfaceArea() { return surfaceArea; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Desk name=\"" + name + "\" surfaceArea=" + surfaceArea; 
    }

    @Override
    public boolean equals(Object o) {
        if(o.getClass() != getClass()) {
            return false;
        }

        Desk newO = (Desk)o;

        return newO.name.equals(this.name) && newO.surfaceArea == this.surfaceArea;
    }
}
