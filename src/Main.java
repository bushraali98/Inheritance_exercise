public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Shape();
        Circle c1 = new Circle("red", true, 7.5);


        shape1.setColor("red");
        shape1.setFilled(true);

        System.out.println("Shape color is: " + shape1.getColor() +
                "\nis it filled? " + shape1.isFilled());

        System.out.println("The area is:  " + c1.getArea(7.5));
        System.out.println("The perimeter is: " + c1.getPerimeter(7.5));

        Rectangle rectangle1 = new Rectangle(5.0, 10.0);
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println(rectangle1.toString());

        System.out.println();
        Square square1 = new Square("red", true, 5.0);
        System.out.println(square1.toString());

    }
}