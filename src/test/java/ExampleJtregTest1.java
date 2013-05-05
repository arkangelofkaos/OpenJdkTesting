/* @test
@summary ExampleJtregTest1 - a simple testcase
@run main ExampleJtregTest1
*/

import javax.accessibility.AccessibleContext;
import javax.swing.*;

/**
 * ../../../bin/jtreg/linux/bin/jtreg -verbose:summary ExampleJtregTest1.java
 */
public class ExampleJtregTest1 {

    public static void main(String[] args) throws Exception {
        JLayer l = new JLayer();
        AccessibleContext acc = l.getAccessibleContext();
        if (acc == null) {
            throw new RuntimeException("JLayer's AccessibleContext is null");
        }
    }

}