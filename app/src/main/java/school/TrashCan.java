package school;

public class TrashCan extends Furniture {
    private boolean full;
    private int volume;

    public TrashCan(boolean full, int volume) {
        super(50, true);
        this.full = full;
        this.volume = volume;
    }

    public int getVolume() { return volume; }
    public boolean getFull() { return full; }

    @Override
    public String toString() {
        return "TrashCan volume=" + volume + " full=" + full;
    }

    @Override
    public boolean equals(Object o) {
        if(o.getClass() != getClass()) {
            return false;
        }

        TrashCan newO = (TrashCan)o;

        return newO.full == full && newO.volume == volume;
    }
}
