package DSATest;

import DSA.string.CustomString; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomStringTest {
    private static final Logger logger = LoggerFactory.getLogger(CustomStringTest.class);
    public static void main(String[] args) {
        logger.info("Starting CustomStringTest");   
        CustomString.printString("Hello");
        CustomString.printStringWithForEach(null);
        CustomString.printStringWithWhileDo("Hello");
        CustomString.convertStringToUpperCase("hello");
        CustomString.convertStringToLowerCase("Hello");
        CustomString.compareTwoStrings("Hello", "Hello");
        logger.info("CustomStringTest completed successfully");
    }

    
}
