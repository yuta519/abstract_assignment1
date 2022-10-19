public class Cylinder extends Shape{
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    @Override
    public double getVolume() {
        return Math.PI*this.height * Math.pow(this.radius  , 2);
    }
}
