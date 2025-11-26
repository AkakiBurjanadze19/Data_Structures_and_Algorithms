package Data_Structures;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Vector2D add(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.x + v2.x, v1.y + v2.y);
    }

    public static Vector2D sub(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.x - v2.x, v1.y - v2.y);
    }

    public static Vector2D mul(Vector2D v, double k) {
        return new Vector2D(v.x * k, v.y * k);
    }

    public static double dotComponent(Vector2D v1, Vector2D v2) {
        return (v1.x * v2.x) + (v1.y * v2.y);
    }

    public static double dotGeo(Vector2D v1, Vector2D v2, double angleInRadians) {
        double magnitude_v1 = length(v1);
        double magnitude_v2 = length(v2);

        return magnitude_v1 * magnitude_v2 * Math.cos(angleInRadians);
    }

    public static double length(Vector2D v) {
        return Math.sqrt(v.x * v.x + v.y * v.y);
    }

    public static Vector2D normalize(Vector2D v) {
        double magnitude = length(v);

        return new Vector2D(v.x / magnitude, v.y / magnitude);
    }

    public static Vector2D project(Vector2D v1, Vector2D v2) {
        double dot_product = dotComponent(v1, v2);
        double magnitude_v2 = length(v2);

        return mul(v2, (dot_product / (magnitude_v2 * magnitude_v2)));
    }

    public String toString() {
        return "<" + x + "," + y + ">";
    }
}