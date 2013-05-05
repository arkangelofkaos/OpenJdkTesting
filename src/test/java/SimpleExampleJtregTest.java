/* @test
@summary SimpleExampleJtregTest - a simple example test
@run main SimpleExampleJtregTest
*/

import javax.accessibility.AccessibleContext;
import javax.swing.*;

/**
 * To run this test, open a console to this project's src/test/java directory and run:
 * <p/>
 * MacOSX & Unix:
 * ../../../bin/jtreg/linux/bin/jtreg -verbose:summary ExampleJtregTest1.java
 * <p/>
 * Windows:
 * ../../../bin/jtreg/win32/bin/jtreg -verbose:summary ExampleJtregTest1.java
 * <p/>
 * Solaris: (untested)
 * ../../../bin/jtreg/solaris/bin/jtreg -verbose:summary ExampleJtregTest1.java
 * <p/>
 * NOTE:
 * jtreg will create some folders and files for its own use.
 * <p/>
 * SAMPLE OUTPUT:
 * Passed: SimpleExampleJtregTest.java
 * Test results: passed: 1
 * Report written to /Users/Seraph/workspace/OpenJdkTesting/src/test/java/JTreport/html/report.html
 * Results written to /Users/Seraph/workspace/OpenJdkTesting/src/test/java/JTwork
 */
public class SimpleExampleJtregTest {

    public static void main(String[] args) throws Exception {
        JLayer l = new JLayer();
        AccessibleContext acc = l.getAccessibleContext();
        if (acc == null) {
            throw new RuntimeException("JLayer's AccessibleContext is null");
        }
    }

}