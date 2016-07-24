package util;

import ie.wit.ictskills.shapes.Measurable;
import ie.wit.ictskills.shapes.Shapes;

import java.util.ArrayList;

/**
 * @file Util.java
 * @brief Collection of methods which provide functionality for different purposes includes methods
 *        maximum() and makeVisible()
 * @author michaelfoy
 * @version 18.04.2016
 */
public class Util {

  /**
   * Measurable interface contains the method double perimeter(). The method maximum here evalutates
   * the single value representing the largest perimeter discovered in the list of Measurable
   * objects.
   * 
   * @param object The list of objects whose classes implement the interface Measurable
   * @return Returns the largest perimeter discovered among entire list objects.
   */
  public static double maximum(ArrayList<Measurable> object) {
    double max = 0;
    for (int i = 0; i < object.size(); i++) {
      double thisPerimeter = object.get(i).perimeter();
      max = thisPerimeter > max ? thisPerimeter : max;
    }
    return max;
  }

  /**
   * Method to make an ArrayList of shapes visible
   * 
   * @param shapes The ArrayList of shapes
   */
  public static void makeVisible(ArrayList<Shapes> shapes) {
    for (Shapes shape : shapes) {
      shape.makeVisible();
    }
  }
}
