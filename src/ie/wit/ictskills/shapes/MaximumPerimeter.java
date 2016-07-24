package ie.wit.ictskills.shapes;

// TODO Task 5: Fully implement Measurable interface in classes Circle, Pentagon, Rectangle,
// Triangle, Ellipse
import java.util.ArrayList;
import util.Util;

/**
 * @file MaximumPerimeter.java
 * @brief Class to find the maximum perimeter of a given array list of measurable objects
 * @author michaelfoy
 * @version 18.04.2016
 */

public class MaximumPerimeter {

  public static void main(String[] args) {
    ArrayList<Measurable> measurables = new ArrayList<>();

    measurables.add(new Circle(30, 20, 60, "red"));
    measurables.add(new Circle(40, 30, 70, "blue"));
    measurables.add(new Circle(50, 40, 80, "green"));
    measurables.add(new Circle(60, 50, 90, "black"));

    measurables.add(new Rectangle(160, 30, 60, 150, "red"));
    measurables.add(new Rectangle(170, 40, 70, 160, "blue"));
    measurables.add(new Rectangle(180, 50, 80, 170, "green"));
    measurables.add(new Rectangle(190, 60, 90, 180, "black"));

    measurables.add(new Triangle(30, 40, 160, 50, "red"));
    measurables.add(new Triangle(40, 50, 170, 60, "blue"));
    measurables.add(new Triangle(50, 60, 180, 70, "green"));
    measurables.add(new Triangle(60, 70, 190, 80, "black"));

    measurables.add(new Pentagon(30, 60, 30, "red"));
    measurables.add(new Pentagon(35, 70, 35, "blue"));
    measurables.add(new Pentagon(40, 80, 40, "green"));
    measurables.add(new Pentagon(45, 90, 45, "black"));

    measurables.add(new Ellipse(30, 40, 160, 50, "red"));
    measurables.add(new Ellipse(40, 50, 170, 60, "blue"));
    measurables.add(new Ellipse(50, 60, 180, 70, "green"));
    measurables.add(new Ellipse(60, 70, 190, 80, "black"));

    System.out.println("Maximum perimeter: " + Util.maximum(measurables));
  }
}
