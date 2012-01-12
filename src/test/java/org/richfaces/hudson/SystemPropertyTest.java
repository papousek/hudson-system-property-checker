package org.richfaces.hudson;

import junit.framework.TestCase;

public class SystemPropertyTest  extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SystemPropertyTest( String testName ) {
        super( testName );
    }

    public void testArgLine() {
        assertNotNull("System property <test.property> is not set.", System.getProperty("test.property"));
    }
    
    public void testPom() {
        assertNotNull("System property <test.pom.property> is not set.", System.getProperty("test.pom.property"));
    }
}
