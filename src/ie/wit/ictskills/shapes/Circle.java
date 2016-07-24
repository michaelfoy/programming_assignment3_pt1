package ie.wit.ictskills.shapes;

/**
 * @file Cirlce.java
 * @brief A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30
 * 
 * @author jfitzgerald
 * @version 2016-04-10
 * 
 * @author michaelfoy
 * @version 18.04.2016
 * 
 */

public class Circle extends Ellipse implements Measurable {
  /**
   * Create a new circle at default position with default color & diameter.
   */
  public Circle() {
    super(120, 120, 0, 0, "red");
  }

  /**
   * Construct a circle of specified dimensions and position
   * 
   * @param diameter Diameter of the circle
   * @param xPosition Position on the x axis
   * @param yPosition Position on the y axis
   * @param color Color of the circle
   */
  public Circle(int diameter, int xPosition, int yPosition, String color) {
    super(diameter, diameter, xPosition, yPosition, color);
  }

  /**
   * Method to find the perimeter of the circle
   * 
   * @return double The perimeter of the circle
   */
  @Override
  public double perimeter() {
    return Math.PI * xdiameter;
  }
}
