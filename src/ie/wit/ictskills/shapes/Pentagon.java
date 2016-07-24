package ie.wit.ictskills.shapes;

// TODO Task 2: Complete Pentagon class
import java.awt.Polygon;

/**
 * @file Pentagon.java
 * @brief This class describes a pentagon and has behaviour to display, resize and move objects
 * @author michaelfoy
 * @version 18.04.2016
 */
public class Pentagon extends Shapes implements Measurable {
  private int radius;

  /**
   * Constructs a default pentagon
   */
  public Pentagon() {
    super(0, 0, "black", false);
    this.radius = 50;
  }

  /**
   * Constructs a pentagon of specified dimensions and position
   * 
   * @param radius The radius of the pentagon
   * @param xPosition The pentagon's position on the x axis
   * @param yPosition The pentagon's position on the y axis
   * @param color Color of the pentagon
   */
  public Pentagon(int radius, int xPosition, int yPosition, String color) {
    super(xPosition, yPosition, color, false);
    this.radius = radius;
  }

  /**
   * Method to modify the size of the pentagon according to a scale
   * 
   * @param scale Factor by which size to be augmented
   */
  @Override
  public void changeSize(int scale) {
    if (radius != 0) {
      this.radius *= scale;
    } else {
      System.out.println("Please enter positive radius");
    }
  }

  /**
   * Method to produce a visible pentagon using Canvas class
   */
  @Override
  void draw() {
    if (isVisible) {
      // Ref: http://mathworld.wolfram.com/Pentagon.html
      double dc1 = 0.25 * (Math.sqrt(5) - 1);
      double dc2 = 0.25 * (Math.sqrt(5) + 1);
      double ds1 = 0.25 * (Math.sqrt(10 + 2 * Math.sqrt(5)));
      double ds2 = 0.25 * (Math.sqrt(10 - 2 * Math.sqrt(5)));// length of pentagon side is 2*ds2
      int c1 = -(int) (radius * dc1);// radius of circle that circumscribes pentagon
      int c2 = -(int) (radius * dc2);
      int s1 = (int) (radius * ds1);
      int s2 = (int) (radius * ds2);

      Canvas canvas = Canvas.getCanvas();
      int[] xpoints = {xPosition, xPosition + s1, xPosition + s2, xPosition - s2, xPosition - s1};
      int[] ypoints =
          {yPosition - radius, yPosition + c1, yPosition - c2, yPosition - c2, yPosition + c1};
      canvas.draw(this, color, new Polygon(xpoints, ypoints, 5));
      canvas.wait(10);
    }
  }

  /**
   * Method to return the perimeter of pentagon object
   * 
   * @return double The perimeter of the pentagon
   */
  @Override
  public double perimeter() {
    return 10 * radius * Math.sin(Math.PI / 5);
  }
}
