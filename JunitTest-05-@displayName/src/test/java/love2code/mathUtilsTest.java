package love2code;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class mathUtilsTest {

    //create an initial method to initialize my methods before they are called for clean coding
    mathUtils mathUtils;

    @BeforeAll
   static void beforeAllInit(){
        System.out.println("this needs to run before all ");
    }

    @AfterEach
    void cleanup(){
        System.out.println("Cleaning up....");
    }

    @BeforeEach
    void init(){
        mathUtils = new mathUtils();
    }

    @Test
    @DisplayName("testing adding Method")
    void add() {

        // instantiate the class

        int expected = 2;
        //get the method to compare
        int actual = mathUtils.add(1,1);
        // do the test
        assertEquals(expected,actual,"the method should add to numbers");
    }

    @Test
    void divideTest(){

        assertThrows(ArithmeticException.class,()->mathUtils.divide(1,0),"unexpected Error thrown");
    }

    @Test
    void computeCircleArea(){

        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"should return the right value");
    }


}