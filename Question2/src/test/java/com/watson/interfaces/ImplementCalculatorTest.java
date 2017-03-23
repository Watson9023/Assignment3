package com.watson.interfaces;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Long on 3/22/2017.
 */
public class ImplementCalculatorTest {

    Calculator calcObj = new CalculatorImplement();
    public void testAddition() throws Exception {
        float result = calcObj.add(27, 93);
        assertEquals(result,120.0f);
    }

    public void testSubtraction() throws Exception {
        float result = calcObj.subtract(93, 27);
        assertEquals(result,66.0f);
    }

    public void testMultiplication() throws Exception {
        float result = calcObj.multiply(23, 63);
        assertEquals(result,2511.0f);
    }


    public void testDivision() throws Exception {
        float result = calcObj.divide(6, 3);
        assertEquals(result,3.0f);
    }
}
