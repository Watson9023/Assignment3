package com.watson.interfaces;

import junit.framework.TestCase;
/**
 * Created by Long on 3/22/2017.
 */
public class calculatorImplimentsTesst extends TestCase{

    Calculator ObjCal = new CalculatorImplement();
    public void testAddition() throws Exception {
        float result = ObjCal.add(27, 93);
        assertEquals(result,120.0f);
    }

    public void testSubtraction() throws Exception {
        float result = ObjCal.subtract(93, 27);
        assertEquals(result,66.0f);
    }

    public void testMultiplication() throws Exception {
        float result = ObjCal.multiply(23, 63);
        assertEquals(result,1449.0f);
    }


    public void testDivision() throws Exception {
        float result = ObjCal.divide(6, 3);
        assertEquals(result,2.0f);
    }
}
