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
}