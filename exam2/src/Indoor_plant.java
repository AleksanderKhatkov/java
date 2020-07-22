public class Indoor_plant extends Plant {
    private Glaze glaze;

    public Indoor_plant(String name, int height, int life_span, Glaze glaze) {
        super(name, height, life_span);
        this.glaze = glaze;
    }

    public Glaze getGlaze() {
        return glaze;
    }

    public void setGlaze(Glaze glaze) {
        this.glaze = glaze;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + " Indoor_plant [glaze=" + glaze + "]";
    }

    @Override
    public String toCsv() {
        return this.getClass().getName() + "," + getName() + "," + getHeight() + "," + getLife_span() + "," + getGlaze();
    }
}
