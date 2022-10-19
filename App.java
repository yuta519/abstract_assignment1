public class App {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 10);
        System.out.println(cylinder.getVolume());

        Sphere shpere = new Sphere(4);
        System.out.println(shpere.getVolume());
    }
}
