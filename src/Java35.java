public class Java35 {
    public static void main(String[] args) {
        String[] books = {"Java in easy steps", "XML in easy steps",     //book titles(duh)
                "SQL in easy steps", "CSS in easy steps",
                "Gone with the wind", "Drop the defense"};

        int counter1 = 0, counter2 = 0, counter3 = 0;       //int counter vars

        for (int i = 0; i < books.length; i++) {    //this lists the first 4 letters of each book title
            System.out.print(books[i].substring(0, 4) + "|");
            if (books[i].endsWith("in easy steps")) counter1++;
            if (books[i].startsWith("Java")) counter2++;
            if (books[i].indexOf("easy") == -1) counter3++;
        }

        System.out.println("\nFound " + counter1 + "titles from this series");  //outputs everything
        System.out.println("Found " + counter2 + "Java title");
        System.out.println("Found " + counter3 + "Other titles");
    }
}
