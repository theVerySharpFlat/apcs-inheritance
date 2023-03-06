package school;

public class BadChair extends Chair {
    private boolean occupied;
    private boolean isSpinny;

    public BadChair(boolean isSpinny) {
        super("Ow!", 0.1f);
        this.occupied = false;
        this.isSpinny = isSpinny;
    }

    public boolean getOccupied() { return occupied; }
    public boolean getSpinny() { return isSpinny; }

    @Override
    public String toString() {
        return "BadChair occupied=" + occupied + " spinny=" + isSpinny;
    }

    @Override
    public boolean equals(Object o) {
        if(o.getClass() != getClass()) return false;

        BadChair newO = (BadChair)o;

        return super.equals(o) && newO.occupied == occupied && newO.isSpinny && isSpinny;
    }
}
