package Tests;
import Data_Structures.Vector2D;

public class Vector2DTest {
    public static void main(String[] args) {
        Vector2D a = new Vector2D(4, 3);
        Vector2D b = new Vector2D(5, 8);

        System.out.println("a + b: " + Vector2D.add(a, b));
        System.out.println("a - b: " + Vector2D.sub(a, b));
        System.out.println("3 * a: " + Vector2D.mul(a, 3));
        System.out.println("3 * b: " + Vector2D.mul(b, 3));
        System.out.println("a * b: " + Vector2D.dotComponent(a, b));

        System.out.println("normalized a: " + Vector2D.normalize(a));

        System.out.println("projection: " + Vector2D.project(a, b));
    }
}