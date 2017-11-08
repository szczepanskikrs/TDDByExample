package Fibonacci;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class FibonacciTest {
    private Fibonacci fibonacci;
    SoftAssert softAssert = new SoftAssert();
    @BeforeTest
    private void setUp() {
        fibonacci = new Fibonacci();
    }
    @DataProvider(name = "testData")
    private static Object[][] testDataArray(){
        return new Object[][]{{0,0},{1,1},{2,1},{3,2},{4,3},{5,5},{10,55},{19,4181}};
    }


    @Test(dataProvider = "testData")
    public void testFibonacciShouldPassWhenStreamFibonacciCalculationAreCorrect(int parameter, int expected) throws Exception {
        assertTrue((fibonacci.streamWay(parameter)).equals(expected));
    }

    @Test(dataProvider = "testData")
    public void testFibonacciShouldPassWhenIterateFibonacciCalculationsAreCorrect(int parameter, int expected) throws Exception {
        assertTrue((fibonacci.iterateWay(parameter)).equals(expected));
    }

    @Test(dataProvider = "testData")
    public void testFibonacciShouldPassWhenRecursiveFibonacciCalculationsAreCorrect(int parameter, int expected) throws Exception {
        assertTrue((fibonacci.recursiveWay(parameter)).equals(expected));
    }

}