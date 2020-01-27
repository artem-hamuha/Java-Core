public class Java42 {
    public static void hello(){
        System.out.println("Hello(Java42)");    //outputs a string
    }
    public static void echo(String arg){    //second method tries to output a passed argument
         try
         {
             System.out.println("You entered:" + arg);
         }
         catch(Exception e)
         {
             System.out.println("Argument required");
         }
    }
}
