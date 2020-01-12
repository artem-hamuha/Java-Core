public class Java28 {
    public static void main(String[] args) {
        boolean yes = true ; boolean no = false ;

        boolean result = (yes && yes); result = (yes && no);

        result = (yes||yes);
        result = (yes||no);
        result = (no||no);

        result = yes ; result = !yes;
    }
}
