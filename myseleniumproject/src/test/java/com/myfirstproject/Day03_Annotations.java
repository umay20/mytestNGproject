package com.myfirstproject;
import org.junit.*;
public class Day03_Annotations {
    /*
    ***. There are 6 junit annotations
        1. @Test : is used to create test case.
        * All test cases must be void cause test cases are created to do assertions
        2.@Before and @After : are used to run before or after EACH @TEST method
        3.@BeforeClass and @AfterClass : are used to run before or after EACH CLASS ONLY ONCE. These methods must be static
     */
    @Before
    public void setUp(){
        System.out.println("This is BEFORE method>>>>>RUNS BEFORE EACH TEST METHOD");
        /*
        Pre Conditions are put in this @Before method such as SET UP, create driver, maximaze window, implicit wait
         */
    }
    @After
    public void tearDown(){
        System.out.println("This is AFTER method>>>>>RUNS AFTER EACH TEST METHOD");
        /*
        After conditions are put in this method such as quit or close, reports generation,....
         */
    }
    @BeforeClass
    public static void setUpClass(){
        System.out.println("This is BEFORE CLASS>>>>>RUNS BEFORE EACH CLASS ONCE");
    }
    @AfterClass
    public static void tearDownClass(){
        System.out.println("This is AFTER CLASS>>>>>RUNS AFTER EACH CLASS ONCE");
    }
    @Test
    public void test1(){
        System.out.println("This is test case 1");
    }
    @Test
    public void test2(){
        System.out.println("This is test case 2");
    }
    @Test
    public void test3(){
        System.out.println("This is test case 3");
    }
    @Test
    public void test4(){
        System.out.println("This is test case 4");
    }
    @Test
    public void test5(){
        System.out.println("This is test case 5");
    }
    @Test
    public void test6(){
        System.out.println("This is test case 6");
    }
}
