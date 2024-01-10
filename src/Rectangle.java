import java.sql.SQLOutput;
import java.util.SortedMap;

public class Rectangle {
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width  = width;
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (width + length);
    }
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(10, 50);
        Square square = new Square(10);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("=============================================");
        System.out.println("--------------Square--------------");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

    }

}