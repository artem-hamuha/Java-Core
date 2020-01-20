public class Java36 {
    public static void main(String[] args) {
        String txt = "" ;   // empty string variable

        if(txt.isEmpty()) txt = "   Borrocudo " ;   //Assign something

        System.out.println("String: " + txt);   //output string value and the number of characters
        System.out.println("Original string length: " + txt.length());

        txt = txt.trim();   //cuts the spaces and shows the size again
        System.out.println("String: " + txt);
        System.out.println("String length: " + txt.length());

        char initial = txt.charAt(0);   //outputs the first letter
        System.out.println("First letter: " + initial);

        initial = txt.charAt((txt.length() -1));    //outputs last letter
        System.out.println("Last letter: " + initial);

        txt = txt.replace('o','a');     //replace stuff
        System.out.println("String: " + txt);
    }
}
