package com.stlang.githubactions;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCalculator {

    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(calculator.add(2, 2), 4);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(2, 2), 0);
    }
    @AfterTest
    public void tearDown() {
        calculator = null;
    }



}
