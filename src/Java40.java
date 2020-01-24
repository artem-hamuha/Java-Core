public class Java40 {
    public static void main(String[] args) {
        String msg = "This is local var in a primary class";    //declared a string and output it
        System.out.println(msg);

        System.out.println(Data.txt);   //declared a txt from class Data

        Data.greeting();    //called a method "greeting"

        Draw.line();    //called method "line"
    }
}
