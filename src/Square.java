public class Square extends Rectangle{
    private double side;


    public Square() {
    }


    public Square(double side) {
        super(side, side);
        this.side = side;
    }


    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }


    public double getSide() {
        return this.side;
    }


    public void setSide(double side) {
        this.side = side;
    }



    @Override
    public String toString() {
        return "Square[side=" + side + ", color=" + getColor() + ", filled=" + isFilled() +
                ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}
