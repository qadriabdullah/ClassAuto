package org.example;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestingE {

    @Test
    public void test13() {
        System.out.println("testing the Test13 and executed");
    }

    @BeforeSuite
    public void test14() {
        System.out.println("testing the Test14 and executed");
    }
}
