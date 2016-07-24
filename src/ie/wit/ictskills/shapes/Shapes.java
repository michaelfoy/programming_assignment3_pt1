package ie.wit.ictskills.shapes;

/**
 * @file Shapes.java
 * @brief An abstract class describing geometric shapes
 * 
 * @author jfitzgerald
 * @version 2016-04-12
 * 
 * @author michaelfoy
 * @version 18.04.2016
 */
public abstract class Shapes {
  int xPosition;
  int yPosition;
  String color;
  boolean isVisible;

  /**
   * Constructs a shape object of specified dimensions and position
   * 
   * @param xPosition Position on the x axis
   * @param yPosition Position on the y axis
   * @param color Color of the shape
   * @param isVisible True if the shape is visible
   */
  public Shapes(int xPosition, int yPosition, String color, boolean isVisible) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.color = color;
    this.isVisible = isVisible;
  }

  /*
   * Abstract method to draw the shape on the Canvas
   */
  abstract void draw();

  /*
   * Abstract method to change size of the shape
   * 
   * @param scale The factor by which the shape is augmented
   */
  abstract void changeSize(int scale);

  /**
   * Method to make the shape visible
   */
  public void makeVisible() {
    isVisible = true;
    draw();
  }

  /**
   * Method to make the shape invisible
   */
  public void makeInvisible() {
    erase();
    isVisible = false;
  }

  /**
   * Method to change the shape's color
   * 
   * @param color
   */
  public void changeColor(String color) {
    this.color = color;
    draw();
  }

  /*
   * Method to erase the shape from the canvas
   */
  protected void erase() {
    if (isVisible) {
      Canvas canvas = Canvas.getCanvas();
      canvas.erase(this);
    }
  }
}
