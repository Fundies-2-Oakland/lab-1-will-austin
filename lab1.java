public class lab1 {
    static void Vector3D(double x, double y, double z) {
        double getX() { return x; }
        double getY() { return y; }
        double getZ() { return z; }
        String toString() {
            return "Vector is located at (" + x + ", " + y + ", " + z + ")";
        }
    }

    public static void main(String[] args) {
        Vector3D balls = Vector3D(5.354583, 6, 0);
        System.out.println(balls.toString());
    }
}