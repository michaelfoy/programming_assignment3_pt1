package ie.wit.ictskills.shapes;

// TODO Task 3: Display 4 cascaded Pentagons differently colored shapes.
import java.util.ArrayList;

import util.Util;

/**
 * @file TestPentagon.java
 * @brief Class to test Pentagon class by populating an array list of pentagons, then displaying
 *        them on a canvas
 * @author michaelfoy
 * @version 18.04.2016
 */

public class TestPentagon {

  public static void main(String[] args) {
    ArrayList<Shapes> shapes = new ArrayList<>();

    shapes.add(new Pentagon(40, 80, 40, "red"));
    shapes.add(new Pentagon(50, 110, 60, "blue"));
    shapes.add(new Pentagon(60, 140, 80, "green"));
    shapes.add(new Pentagon(70, 170, 100, "black"));

    Util.makeVisible(shapes);
  }
}
