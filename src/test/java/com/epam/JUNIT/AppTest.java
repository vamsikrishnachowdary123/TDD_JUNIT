package com.epam.JUNIT;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     *       “ABCD” => “BCD” 
             “AACD” => “CD”  
             “BACD” => “BCD” 
             “BBAA” => “BBAA”        
             “AABAA” => “BAA”
     */
	
	
	AChecker Aobject=new AChecker();
	
	
    @Test
    public void singleAAtFirst()
    {
    	
    	String result=Aobject.aReplacer("ABCD");
    	
    	
        assertEquals("BCD",result);
    }
    
    @Test
    public void twoAAtStart()
    {
    
    	String result=Aobject.aReplacer("AACD");
    	
    	
        assertEquals("CD",result);
    }
    @Test
    public void singleAAtSecond()
    {
    
    	String result=Aobject.aReplacer("BACD");
    	
    	
        assertEquals("BCD",result);
    }
    @Test
    public void noAAtStart()
    {
    	
    	String result=Aobject.aReplacer("BBAA");
    	
    	
        assertEquals("BBAA",result);
    }
    @Test
    public void twoAAtFirstLast()
    {
    
    	String result=Aobject.aReplacer("AABAA");
    	
    	
        assertEquals("BAA",result);
    }
}
