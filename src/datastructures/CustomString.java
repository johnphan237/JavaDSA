package datastructures;

public class CustomString {

    /**
     * Print string with for loop
     * @param str
     * @throws NullPointerException if str is null
     */
    public static void printString(String str){
        System.out.println("Printing string with for loop");
        if (str == null){
            throw new NullPointerException("String is null");
        }
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void printStringWithWhileDo(String str){
        System.out.println("Printing string with while do loop");
        int i = 0;
        do {
            System.out.println(str.charAt(i));
            i++;
        } while (i < str.length());
    }
    
    public static void printStringWithForEach(String str){
        System.out.println("Printing string with for each loop");
        for (char c : str.toCharArray()){
            System.out.println(c);
        }
    }
    
    
}
