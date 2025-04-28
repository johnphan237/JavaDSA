package datastructures;

public class CustomString {

    /**
     * Print string with for loop
     * @param str
     * @throws NullPointerException if str is null
     */
    @Deprecated
    public static void printString(String str){
        System.out.println("Printing string with for loop");
        if (str == null){
            throw new NullPointerException("String is null, please check your input");
        }
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }

    /**
     * Print string with while do loopo
     * @param str
     * @throws NullPointerException if string is null
     */

    public static void printStringWithWhileDo(String str){
        System.out.println("Printing string with while do loop");
        if (str == null){
            throw new NullPointerException("String is null, please check your input");
        }
        int i = 0;
        do {
            System.out.println(str.charAt(i));
            i++;
        } while (i < str.length());
    }

    /**
     * Print string with for each loop
     * @param str
     * @throws NullPointerException if string is null
     */
    public static void printStringWithForEach(String str){
        System.out.println("Printing string with for each loop");
        if (str == null){
            throw new NullPointerException("String is null, please check your input");
        }
        for (char c : str.toCharArray()){
            System.out.println(c);
        }
    }

    /**
     * Convert string to uppercase
     * @param str
     * @return string in uppercase
     */
    public static String convertStringToUpperCase(String str){
        if (str == null){
            throw new NullPointerException("String is null, please check your input");
        }
        return str.toUpperCase();
    }

    /**
     * Convert string to lowercase
     * @param str
     * @return string in lowercase
     */
    public static String convertStringToLowerCase(String str){
        if (str == null){
            throw new NullPointerException("String is null, please check your input");
        }
        return str.toLowerCase();
    }

    /**
     * Compare two strings 
     * @param str1 ,str2
     * @return true if str1 is equal to str2, false otherwise
     */
    public static boolean compareTwoStrings(String str1, String str2){
        if (str1 == null || str2 == null){
            throw new NullPointerException("String is null, please check your input");
        }
        return str1.equals(str2);
    }
    
}
