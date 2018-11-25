public class FindAreaPerimeter 
{
  public static void main(String[] args) 
  {
    // Circle 
    double radius = 5;
    Figure Circle = new Circle(radius);
    System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + Circle.findarea()
            + "\nResulting Perimeter: " + Circle.findperimeter() + "\n");
    // Rectangle 
    double width = 5, length = 7;
    Figure rectangle = new Rectangle(width, length);
    System.out.println("Rectangle width: " + width + " and length: " + length + "\nResulting area: " + rectangle.findarea()
                + "\nResulting perimeter: " + rectangle.findperimeter() + "\n");
    // Triangle 
    double a = 5, b = 3, c = 4;
    Figure triangle = new Triangle(a,b,c);
    System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.findarea()
                + "\nResulting Perimeter: " + triangle.findperimeter() + "\n");
  }
}
abstract class Figure 
{
  public abstract double findarea();
  public abstract double findperimeter();
}


class Circle extends Figure {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findarea() {
       
        return pi * Math.pow(radius, 2);
    }

    public double findperimeter() {
       
        return 2 * pi * radius;
    }
}

class Rectangle extends Figure {
    private final double width, length; 

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double findarea() {
      
        return width * length;
    }

    @Override
    public double findperimeter() {
       
        return 2 * (width + length);
    }

}

class Triangle extends Figure {
    private final double a, b, c; 

    public Triangle() {
        this(1,1,1);
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double findarea() {
       
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double findperimeter() {
       
        return a + b + c;
    }
}