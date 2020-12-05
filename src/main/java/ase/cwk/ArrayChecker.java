package ase.cwk;

/**
 * Class for COMP5911M Coursework, Part 3.
 *
 * @author Nick Efford
 */
public class ArrayChecker {
  public boolean check(double[] expected, double[] actual, double maxValue, double delta) {

    // Check for length differences
    if (actual.length != expected.length) {
      return false;
    }

    // Clip 'too large' values
    for (int i = 0; i < actual.length; ++i) {
      if (actual[i] > maxValue) {
        actual[i] = maxValue;
      }
      if (Math.abs(expected[i] - actual[i]) > delta) {
        return false;
      }
    }

    return true;
  }
}
