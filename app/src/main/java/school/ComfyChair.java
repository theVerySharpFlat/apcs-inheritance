package school;

public class ComfyChair extends Chair {
    private boolean occupied;
    private boolean isSpinny;

    public ComfyChair(boolean occupied, boolean isSpinny) {
        super("Comfy!", 1.0f);
        this.occupied = occupied;
        this.isSpinny = isSpinny;
    }

    public boolean getOccupied() { return occupied; }
    public boolean getSpinny() { return isSpinny; }

    @Override
    public String toString() {
        return "ComfyChair occupied=" + occupied + " spinny=" + isSpinny;
    }

    @Override
    public boolean equals(Object o) {
        if(o.getClass() != getClass()) return false;

        ComfyChair newO = (ComfyChair)o;

        return super.equals(o) && newO.occupied == occupied && newO.isSpinny && isSpinny;
    }
}
