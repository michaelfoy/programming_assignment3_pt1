package ie.wit.ictskills.shapes;

// TODO Task 4: Complete Ellipse, inherit Shapes, implement Measurable, subclass Circle.
import ie.wit.ictskills.util.ellipse.EllipseMeasure;
import java.awt.geom.*;

/**
 * @file Ellipse.java
 * @brief An ellipse that can be manipulated and that draws itself on a canvas. 
 * @author michaelfoy
 * @version 18.04.2016
 */

public class Ellipse extends Shapes implements Measurable {
  protected int xdiameter;
  private int ydiameter;

  /**
   * Constructs a default ellipse
   */
  public Ellipse() {
    super(120, 180, "green", false);
    setState(100, 50);
  }

  /**
   * Constructs an ellipse of specified size and position
   * 
   * @param xDiameter Diameter along the x axis
   * @param yDiameter Diameter along the y axis
   * @param xPosition Position on the x axis
   * @param yPosition Position on the y axis
   * @param color Color of the ellipse
   */
  public Ellipse(int xDiameter, int yDiameter, int xPosition, int yPosition, String color) {
    super(xPosition, yPosition, color, false);
    setState(xDiameter, yDiameter);
  }

  /*
   * Method to set the diameters of the ellipse
   * 
   * @param xDiameter Diameter along the x axis 
   * @param yDiameter Diameter along the y axis
   */
  private void setState(int xDiameter, int yDiameter) {
    this.xdiameter = xDiameter;
    this.ydiameter = yDiameter;
  }

  /**
   * Method to modify size of the ellipse according to a scale
   * 
   * @param scale Factor by which the size is to be augmented
   */
  @Override
  public void changeSize(int scale) {
    erase();
    xdiameter *= scale;
    ydiameter *= scale;
    draw();
  }

  /**
   * Method which implements Canvas class to display an ellipse
   */
  @Override
  void draw() {
    if (isVisible) {
      Canvas canvas = Canvas.getCanvas();
      canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, xdiameter, ydiameter));
      canvas.wait(10);
    }
  }

  /**
   * Method to find the perimeter of the ellipse
   * 
   * @return double The perimeter of the ellipse
   */
  @Override
  public double perimeter() {
    return EllipseMeasure.perimeter(xdiameter, ydiameter);
  }
}
