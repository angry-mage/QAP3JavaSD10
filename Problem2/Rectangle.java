public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double lenght, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public Rectangle(){
        this.width = 2.0;
        this.length = 5.0;
        this.color = "blue";
        this.filled = false;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (length * 2) + (width * 2);
    }

    public String toString(){
        return "Rectangle [Color = " + getColor() + " Filled = " + isFilled() + " Width = " + getWidth() + " Length = " + getLength() + "]";
    }
}
