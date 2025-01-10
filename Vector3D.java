public class lab1 {
    public static void main(String[] args) {
        
    }
}

public class Vector3D {

    Vector3D(double x, double y, double z) {}

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getZ() {
        return z;
    }

    public String toString() {
        return "Vector is located at (" + x + ", " + y + ", " + z + ")";
    }

    public double getMagnitude() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
    }

    public Vector3D normalize() {
        if (getMagnitude() == 0) {
            throw IllegalStateException;
        } else {
            return Vector3D(x/getMagnitude(), y/getMagnitude(), z/getMagnitude());
        }
    }

    public Vector3D add(Vector3D v1, Vector3D v2) {
        double newX = v1.getX() + v2.getX();
        double newY = v1.getY() + v2.getY();
        double newZ = v1.getZ() + v2.getZ();
        return Vector3D(newX,newY,newZ);
    }

    public Vector3D multiply(Vector3D v1, Vector3D v2) {
        double newX = v1.getX() * v2.getX();
        double newY = v1.getY() * v2.getY();
        double newZ = v1.getZ() * v2.getZ();
        return Vector3D(newX,newY,newZ);
    }
}


