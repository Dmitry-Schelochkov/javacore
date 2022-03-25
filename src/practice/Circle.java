package practice;

public class Circle {
    public static double square(double p, int r) {
        return p * r * r;
    }

    public static void main(String[] args) {
        double s = Circle.square(3.14, 2);
                System.out.println(s);

    }
}
