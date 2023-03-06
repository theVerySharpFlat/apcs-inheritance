package school;

public class Chair extends Furniture {
    private String name;
    private float comfort;

    public Chair(String name, float comfort) {
        super(90, true);
        this.name = name;
        this.comfort = comfort;
    }

    public String getName() { return name; }
    public float getComfort() { return comfort; }

    @Override
    public String toString() {
        return "Chair name=\"" + name + "\" comfort=" + comfort;
    }

    @Override
    public boolean equals(Object o) {
        if(o.getClass() != this.getClass()) return false;

        Chair newO = (Chair)o;

        return (newO.name.equals(name)) && (newO.comfort == comfort);
   }

}
