package org.richfaces.hudson;

import junit.framework.TestCase;

public class SystemPropertyTest  extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SystemPropertyTest( String testName )
    {
        super( testName );
    }

    public void testApp()
    {
        assertNotNull("System property <test.property> is not set.", System.getProperty("test.property"));
    }
}
