public class Cylinder extends Shape{
    private double height;
    private double radius;

    public Cylinder(double w, double h) {
        this.height = h;
        this.radius = w;
    }

    @Override
    public double getVolume() {
        return Math.PI*this.height * Math.pow(this.radius  , 2);
    }
}
