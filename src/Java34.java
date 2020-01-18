public class Java34 {
    public static void main(String[] args) {
        String password = "dude" ;      //made string var with all lowercase letters


        try{}      //caught the exception of when the password does not occur
        catch(Exception e){
        if(args[0].toLowerCase().equals(password)){
            System.out.println("Password required");
            System.out.println("Password accepted");
        }
        else{
            System.out.println("Incorrect password");
        }
    }
    }
}
