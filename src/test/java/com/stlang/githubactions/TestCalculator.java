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
        Assert.assertEquals(calculator.add(5, 5), 10);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(10, 2), 8)
    }
    @AfterTest
    public void tearDown() {
        calculator = null;
    }



}
