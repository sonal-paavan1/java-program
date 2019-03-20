public class Hypo {
    static int a = 6;
    static int b = 8;
    static double c;

    public static void main(String args[]) {
        System.out.println("Triangle side1: " + a);
        System.out.println("Triangle side2:" + b);

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hypotenuse =" + c);

    }
}