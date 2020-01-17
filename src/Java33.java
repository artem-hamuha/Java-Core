public class Java33 {
    public static void main(String[] args) {
        String a1= "My " ;      //I created 2 vars
        String a2 = "name is Artem" ;

        String title = a1.concat(a2);       //used concat to assign title to the 2 vars

        System.out.println("\"" + title + "\" has");
        System.out.println(title.length() + " characters");     //this show the length of the sentence
    }
}
