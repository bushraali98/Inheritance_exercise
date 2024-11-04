public class Shape {
    private String color;
    private boolean filled;

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

     public boolean isFilled() {
        return this.filled;
     }

     Shape(){

     }

    public String toString() {
        return ("Color: " + getColor() +
                "Is it filled: " + isFilled());
    }
}
