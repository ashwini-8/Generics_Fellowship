package com.bridgelabz;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class FindMaxGenericsTest<findmax> {
    FindMaxGenerics findmax = new FindMaxGenerics();

    @Test
    public void givenFirstNumberAsMaxNumber_ShouldReturn_FirstNumberAsMax() {

        Integer max = findmax.testMaximum(200, 25, 105);
        Assert.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondNumberAsMaXNumber_ShouldReturnSecondNumberAsMaximum() {
        Integer max1 = findmax.testMaximum(10, 200, 150);
        Assert.assertEquals((Integer) 200, max1);
    }

    @Test
    public void givenThirdNumberAsMaXNumber_ShouldReturnThirdNumberAsMaximum() {
        Integer max1 = findmax.testMaximum(10, 20, 60);
        Assert.assertEquals((Integer) 60, max1);
    }

    @Test
    public void givenFirstFloatAsMaxNumber_ShouldReturnFirstFloatAsMaximum() {
       Double max1 = findmax.testMaximumDouble(20.00, 0.00, 10.00);
        Assert.assertEquals((Double) 20.00, max1);
    }

    @Test
    public void givenSecondFloatAsMaxNumber_ShouldReturnSecondFloatAsMaximum() {
        Double max1 = findmax.testMaximumDouble(20.00, 30.00, 10.00);
        Assert.assertEquals((Double) 30.00, max1);
    }
    @Test
    public void givenThirdFloatAsMaxNumber_ShouldReturnThirdFloatAsMaximum() {
        Double max1 = findmax.testMaximumDouble(20.00, 30.00, 40.00);
        Assert.assertEquals((Double) 40.00, max1);
    }
    @Test
    public void givenFirstLetterAsMaximum_ShouldReturnFirstLetterAsMaximum() {
        String max2 = findmax.testMaximumString("rajkumar", "ashwini", "patil");
        Assert.assertEquals((String) "rajkumar", max2);
    }

    @Test
    public void givenSecondLetterAsMaximum_ShouldReturnSecondLetterAsMaximum() {
        String max2 = findmax.testMaximumString("ashwini", "rajkumar", "patil");
        Assert.assertEquals((String) "rajkumar", max2);
    }

    @Test
    public void givenThirdLetterAsMaximum_ShouldReturnThirdLetterAsMaximum() {
        String max2 = findmax.testMaximumString("patil", "ashwini", "rajkumar");
        Assert.assertEquals((String) "rajkumar", max2);
    }

}