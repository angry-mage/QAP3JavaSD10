public class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public Shape(){
        this.color = "green";
        this.filled = true;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = true;
    }

    public String toString(){
        return "Shape [Color = " + getColor() + " Filled = " + isFilled() + "]";
    }
}
