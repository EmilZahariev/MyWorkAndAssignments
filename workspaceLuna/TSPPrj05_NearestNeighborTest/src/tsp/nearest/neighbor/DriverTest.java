package tsp.nearest.neighbor;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DriverTest</code> contains tests for the class <code>{@link Driver}</code>.
 *
 * @generatedBy CodePro at 1/22/17 4:12 PM
 * @author emil
 */
public class DriverTest {
  /**
   * Run the Driver() constructor test.
   *
   * @generatedBy CodePro at 1/22/17 4:12 PM
   */
  @Test
  public void testDriver_1()
    throws Exception {
    Driver result = new Driver();
    assertNotNull(result);
    // add additional test code here
  }

  /**
   * Run the void main(String[]) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 1/22/17 4:12 PM
   */
  @Test
  public void testMain_1()
    throws Exception {
    String[] args = new String[] {};

    Driver.main(args);

    // add additional test code here
  }

  /**
   * Perform pre-test initialization.
   *
   * @throws Exception
   *         if the initialization fails for some reason
   *
   * @generatedBy CodePro at 1/22/17 4:12 PM
   */
  @Before
  public void setUp()
    throws Exception {
    // add additional set up code here
  }

  /**
   * Perform post-test clean-up.
   *
   * @throws Exception
   *         if the clean-up fails for some reason
   *
   * @generatedBy CodePro at 1/22/17 4:12 PM
   */
  @After
  public void tearDown()
    throws Exception {
    // Add additional tear down code here
  }

  /**
   * Launch the test.
   *
   * @param args the command line arguments
   *
   * @generatedBy CodePro at 1/22/17 4:12 PM
   */
  public static void main(String[] args) {
    new org.junit.runner.JUnitCore().run(DriverTest.class);
  }
}