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
        Integer max = findmax.testMaximum(10, 200, 150);
        Assert.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenThirdNumberAsMaXNumber_ShouldReturnThirdNumberAsMaximum() {
        Integer max = findmax.testMaximum(10, 20, 60);
        Assert.assertEquals((Integer) 60, max);
    }
}