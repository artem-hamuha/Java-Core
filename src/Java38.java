public class Java38 {
    public static void main(String[] args) {    //called different overloaded methods
        System.out.println(write(12));
        System.out.println(write("Twelve"));
        System.out.println(write(4,16));
    }

    public static String write(int num) {       //these 3 return a string to the caller
        return("Integer passed is " + num);}

    public static String write(String num) {
        return("String passed is " + num);}

    public static String write(int num1,int num2) {
        return("Sum total is " + (num1*num2));}
}