public class Video4 {
    public static void main(String[] args) {
        //String message = new String("Hello"); <-- this is not bad but there is a better way
        String message = ("   Hi");    //better
        System.out.println(message);    //you still get same result so its opinionated

        message += " you";  //you could also add stuff
        System.out.println(message.endsWith(" you"));   //u get feed back like false and true
        System.out.println(message .length());  //tells you the length of the sentence
        System.out.println(message.indexOf("H"));   //tells you like what spot its located in
        System.out.println(message.replace("H", "L"));  //can replace stuff in a string
        //also the original string doesn't change
        System.out.println(message.toLowerCase());  //and toLowerCase makes all lower case
        //toUpperCase gets all to uppercase
        System.out.println(message.trim()); //removes spaces in front and after the string
    }
}
