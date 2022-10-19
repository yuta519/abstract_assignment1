public class Sphere extends Shape{
    private double radius;

    public Sphere(double r) {
        this.radius = r;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(this.radius  , 3);
    }
}
