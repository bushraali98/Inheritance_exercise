public class Circle extends Shape{

    private double radius = 1.0;

    Circle (){

    }
    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(double radius) {
        return (this.radius * this.radius * Math.PI);
    }

    public double getPerimeter(double radius) {
        return (2 * Math.PI * this.radius);
    }


}
