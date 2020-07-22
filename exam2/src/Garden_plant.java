public class Garden_plant extends Plant {
    private double occupied_area;

    public Garden_plant(String name, int height, int life_span, double occupied_area) {
        super(name, height, life_span);
        this.occupied_area = occupied_area;
    }


    public double getOccupied_area() {
        return occupied_area;
    }

    public void setOccupied_area(double occupied_area) {
        this.occupied_area = occupied_area;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + " Garden_plant [occupied_area=" + occupied_area + "]";
    }

    @Override
    public String toCsv() {
        return this.getClass().getName() + "," + getName() + "," + getHeight() + "," + getLife_span() + "," + getOccupied_area();
    }
}