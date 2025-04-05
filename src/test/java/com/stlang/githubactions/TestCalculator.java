package com.stlang.githubactions;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalculator {

    private Calculator calculator;

    @BeforeTest
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(calculator.add(1, 2), 3);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(1, 2), -1);
    }

    @AfterTest
    public void tearDown() {
        calculator = null;
    }

}
