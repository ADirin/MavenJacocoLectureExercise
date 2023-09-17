package org.example;



import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;


public class AppTest 

{
    @Test
    public void testDistanceCalculate() {
        App point1 = new App(0,0);
        App point2 = new App(3,4);
        double expectedDistance = 5.0;
        double actualDistance = DistanceCalculator.calculateDistance(point1, point2);
        assertEquals(expectedDistance, actualDistance, 0.001);


    }
}
