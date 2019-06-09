package com.testing.forum.tdd;

import org.junit.BeforeClass;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("this is the beginning of tests");
    }
}
