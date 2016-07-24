package ie.wit.ictskills.shapes;

// TODO Task 1: Refactor: derive from Shapes super class
/**
 * @file Rectangle.java
 * @brief Class to describe a rectangle including methods to manipulate the shape,
 * @author michaelfoy
 * @version 18.04.2016
 */

public class Rectangle extends Shapes implements Measurable {
  private int xSideLength;
  private int ySideLength;

  /**
   * Constructs a rectangle of default dimensions and position
   */
  public Rectangle() {
    super(60, 50, "red", false);
    setState(60, 30);
  }

  /**
   * Constructs a rectangle of specified dimensions and position
   * 
   * @param xSideLength Width of the rectangle
   * @param ySideLength Height of the rectangle
   * @param xPosition Position on the x axis
   * @param yPosition Position on the y axis
   * @param color Color of the rectangle
   */
  public Rectangle(int xSideLength, int ySideLength, int xPosition, int yPosition, String color) {
    super(xPosition, yPosition, color, false);
    setState(xSideLength, ySideLength);
  }

  /**
   * Method to set the size of the rectangle
   * 
   * @param xSideLength Width of the rectangle
   * @param ySideLength Height od the rectangle
   */
  private void setState(int xSideLength, int ySideLength) {
    this.xSideLength = xSideLength;
    this.ySideLength = ySideLength;
  }

  /**
   * Method to modify size of the rectangle according to a scale
   * 
   * @param scale Factor by which the size is to be augmented
   */
  @Override
  public void changeSize(int scale) {
    if (xSideLength > 0 && ySideLength > 0) {
      erase();
      this.xSideLength *= scale;
      this.ySideLength *= scale;
      draw();
    } else {
      System.out.println("Please enter rectangle with positive dimensions");
    }
  }

  /**
   * Method which implements Canvas class to display a rectangle
   */
  @Override
  void draw() {
    if (isVisible) {
      Canvas canvas = Canvas.getCanvas();
      canvas.draw(this, color,
          new java.awt.Rectangle(xPosition, yPosition, xSideLength, ySideLength));
      canvas.wait(10);
    }
  }

  /**
   * Method to find the perimeter of the rectangle
   * 
   * @return double The perimeter of the rectangle
   */
  @Override
  public double perimeter() {
    return 2 * (xSideLength + ySideLength);
  }

  /**
   * Main method to instantiate and display a rectangle object
   * 
   * @param args
   */
  public static void main(String[] args) {
    Rectangle box = new Rectangle(100, 50, 50, 100, "red");
    box.makeVisible();
  }
}
