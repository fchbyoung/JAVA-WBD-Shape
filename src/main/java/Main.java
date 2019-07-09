public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle("white", true, 2);
        double area1 = ((Circle) shape1).getArea();
        double perimeter1 = ((Circle) shape1).getPerimeter();
        String str1 = shape1.toString();
        System.out.println("Area = " + area1);
        System.out.println("Perimeter = " + perimeter1);
        System.out.println(str1);

        System.out.println("--------------------------------------------");

        Shape shape2 = new Rectangle(2,3);
        double area2 = ((Rectangle) shape2).getArea();
        double perimeter2 = ((Rectangle) shape2).getPerimeter();
        String str2 = shape2.toString();
        System.out.println("Area = " + area2);
        System.out.println("Perimeter = " + perimeter2);
        System.out.println(str2);

    }
}
