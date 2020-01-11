public class Java16 {
    public static void main(String[] args) {
    float days = 365.25f ;
    String weeks = "52" ;

    int daysInt = (int) days ;

    int weeksInt = Integer.parseInt(weeks) ;

    int week = (daysInt/weeksInt) ;
        System.out.println("Days per week : " + week);
    }
}
