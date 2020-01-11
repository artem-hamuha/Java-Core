public class Java11 {
    public static void main(String[] args) {

        int month = 11, year = 2019, num = 29 ;

//        switch (month){
//            case 4 : case 6 : case 9 : case 11 : num = 30 ; break;
//            case 2 : num = (year % 4 == 0) ? 29 : 28 ; break ;
//        }




        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
        }
    }
}
