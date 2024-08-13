public class Square extends Shape {
    private double side;

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public Square(){
        this.side = 4.0;
        this.color = "green";
        this.filled = true;
    }

    public double getSide(){
        return this.side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public void setLength(double side){

    }
}
