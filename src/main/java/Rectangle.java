import java.util.Scanner;

/**
 * TODO FOR HOMEWORK - Rectangle.java
 *      [ ] Update both the set method for rectangle like you did for square
 *      [ ] Write the setters for the Rectangle Class
 *      [ ] Write methods for the Rectangle Class
 */
public class Rectangle {
    /**
     * The length of the rectangle
     */
    private double length;

    /**
     * The width of the rectangle
     */
    private double width;

    /**
     * Creates an instance of the Rectangle class
     */
    public Rectangle() {
    }

    /**
     * Gets the length of the rectangle
     * @return The length
     */
    public double getLength() {
        return length;
    }

    // TODO FOR HOMEWORK: Write the setLength method
    //      NOTE: Use a conditional to only set the value if it's positive and non-zero
    public void setLength( double length)
    {
        if (length > 0 ) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    // TODO FOR HOMEWORK: Write the setWidth method
    //      NOTE: Use a conditional to only set the value if it's positive and non-zero
    public void setWidth(double width)
    {
        if (width > 0){
            this.width = width;
        }
    }

    // TODO FOR HOMEWORK: Write the method for area
    public double area() {
        return this.length * this.width;
    }

    // TODO FOR HOMEWORK: Write the method for perimeter
    public double perimeter(){
        return 2 * ( this.length + this.width );
    }

    // TODO FOR HOMEWORK: Write a main method
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter width: ");
        double width = Double.parseDouble(scanner.nextLine());

        r.setLength(length);
        r.setWidth(width);

        double area = r.area();
        double perimeter = r.perimeter();

        System.out.println("A rectangle with length of " + r.getLength() + " and width of " + r.getWidth() + " has an area of: " + area);
        System.out.println("A rectangle with length of " + r.getLength() + " and width of " + r.getWidth() + " has a perimeter of: " + perimeter);
    }
}