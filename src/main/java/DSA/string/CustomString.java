package DSA.string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomString {
    private static final Logger logger = LoggerFactory.getLogger(CustomString.class);

    /**
     * Print string with for loop
     * @param str
     * @deprecated Use {@link #printStringWithForEach(String)} instead
     * @throws NullPointerException if str is null
     */
    @Deprecated(since = "30-04-2025", forRemoval = false)
    public static void printString(String str){
        logger.info("Printing string with for loop");
        if (str == null){
            logger.error("String is null, please check your input");
            throw new NullPointerException("String is null, please check your input");
        }
        for (int i = 0; i < str.length(); i++){
            logger.debug("Current character at position {}: {}", i, str.charAt(i));
        }
        logger.info("Exiting printString");
    }

    /**
     * Print string with while do loopo
     * @param str
     * @throws NullPointerException if string is null
     */

    public static void printStringWithWhileDo(String str){
        logger.info("Printing string with while do loop");
        if (str == null){
            logger.error("String is null, please check your input");
            throw new NullPointerException("String is null, please check your input");
        }
        int i = 0;
        do {
            logger.debug("Current character at position {}: {}", i, str.charAt(i));
            i++;
        } while (i < str.length());
        logger.info("Exiting printStringWithWhileDo");
    }

    /**
     * Print string with for each loop
     * @param str
     * @throws NullPointerException if string is null
     */
    public static void printStringWithForEach(String str){
        logger.info("Printing string with for each loop");
        try {
            // if (str == null){
            //     logger.error("String is null, please check your input");
            //     throw new NullPointerException("String is null, please check your input");
            // }
            for (char c : str.toCharArray()){
                logger.debug("Current character: {}", c);
            }
        } catch (Exception e) {
            logger.error("Error occurred while printing string with for each loop: {}", e.getMessage());
        }
        logger.info("Exiting printStringWithForEach");
    }

    /**
     * Convert string to uppercase
     * @param str
     * @return string in uppercase
     */
    public static String convertStringToUpperCase(String str){
        logger.info("Converting string to uppercase: {}", str);
        if (str == null){
            logger.error("String is null, please check your input");
            throw new NullPointerException("String is null, please check your input");
        }
        String result = str.toUpperCase();
        logger.debug("Converted string: {}", result);
        logger.info("Exiting convertStringToUpperCase");
        return result;
    }

    /**
     * Convert string to lowercase
     * @param str
     * @return string in lowercase
     */
    public static String convertStringToLowerCase(String str){
        logger.info("Converting string to lowercase: {}", str);
        if (str == null){
            logger.error("String is null, please check your input");
            throw new NullPointerException("String is null, please check your input");
        }
        String result = str.toLowerCase();
        logger.debug("Converted string: {}", result);
        logger.info("Exiting convertStringToLowerCase");
        return result;
    }

    /**
     * Compare two strings 
     * @param str1 ,str2
     * @return true if str1 is equal to str2, false otherwise
     */
    public static boolean compareTwoStrings(String str1, String str2){
        logger.info("Comparing strings: {} and {}", str1, str2);
        if (str1 == null || str2 == null){
            logger.error("String is null, please check your input");
            throw new NullPointerException("String is null, please check your input");
        }
        boolean result = str1.equals(str2);
        logger.debug("Comparison result: {}", result);
        logger.info("Exiting compareTwoStrings");
        return result;
    }
}
