package love2code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class mathUtilsTest {

    @Test
    void add() {

        // instantiate the class
        mathUtils  mathUtils = new mathUtils();
        int expected = 2;
        //get the method to compare
        int actual = mathUtils.add(1,1);
        // do the test
        assertEquals(expected,actual,"the method should add to numbers");
    }

    @Test
    void divideTest(){
        mathUtils mathUtils = new mathUtils();
        assertThrows(ArithmeticException.class,()->mathUtils.divide(1,0),"unexpected Error thrown");
    }

    @Test
    void computeCircleArea(){
        mathUtils mathUtils = new mathUtils();
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"should return the right value");
    }


}