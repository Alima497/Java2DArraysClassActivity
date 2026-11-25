public class areaOfSquare{
    public static int area(int side) {
        return side*side;
    }
    public static int area(int width, int height) {
        return width*height;
    }
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        System.out.println("The area of square:" + area(4));
        System.out.println("The area of rectangular: " + area (3,4));
        System.out.println("The area of circle:" + area(2.0));

    }

}
