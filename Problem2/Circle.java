public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle(){
        this.radius = 1.0;
        this.color = "red";
        this.filled = true;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * 2;
    }

    public double getPerimeter(){
        return Math.PI * (radius + radius);
    }

    public String toString(){
        return "Circle [Color = " + getColor() + " Filled = " + isFilled() + " Radius = " + getRadius() + "]";
    }
}
