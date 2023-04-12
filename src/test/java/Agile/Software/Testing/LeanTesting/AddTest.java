package Agile.Software.Testing.LeanTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AddTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void addTest()
    {
        Add result = new Add();
        
    	assertEquals(4, result.add(2, 2));
    }
}
