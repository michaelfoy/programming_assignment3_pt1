package ie.wit.ictskills.shapes;

/**
 * @file Triangle.java
 * @brief Class to describe a triangle including methods to display, modify and get information on
 *        the object
 * @author michaelfoy
 * @version 18.04.2016
 */

public class Triangle extends Shapes implements Measurable {
  private int height;
  private int width;

  /**
   * Constructs a triangle of default dimensions and position
   */
  public Triangle() {
    super(150, 65, "black", true);
    this.height = 50;
    this.width = 75;
  }

  /**
   * Constructs a triangle of specified dimensions and position
   * 
   * @param height Height of the triangle
   * @param width Width of the triangle
   * @param xPosition Position on the x axis
   * @param yPosition Position on the y axis
   * @param color Color of the triangle
   */
  public Triangle(int height, int width, int xPosition, int yPosition, String color) {
    super(xPosition, yPosition, color, true);
    this.height = height;
    this.width = width;
  }

  /**
   * Method to find the perimeter of the triangle
   * 
   * @return double The perimeter of the triangle
   */
  @Override
  public double perimeter() {
    return 2 * Math.hypot(height, width / 2) + width;
  }

  /**
   * Method which implements Canvas class to display a triangle
   */
  @Override
  // TODO Auto-generated method stub
  void draw() {
    if (isVisible) {
      int[] xPos = {xPosition, xPosition + (width / 2), xPosition - (width / 2)};
      int[] yPos = {yPosition, yPosition + height, yPosition + height};
      Canvas canvas = Canvas.getCanvas();
      canvas.draw(this, color, new java.awt.Polygon(xPos, yPos, 3));
      canvas.wait(10);
    }
  }

  /**
   * Method to modify size of the triangle according to a scale
   * 
   * @param scale Factor by which the size is to be augmented
   */
  @Override
  // TODO Auto-generated method stub
  void changeSize(int scale) {
    if (height > 0 && width > 0) {
      erase();
      height *= scale;
      width *= scale;
      draw();
    }
  }
}
