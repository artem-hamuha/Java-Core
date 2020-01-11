public class Java17 {
    public static void main(String[] args) {
        String[] str = {"Java","Maya","Python"} ;

        int[] num = new int[3] ;

        num[0] = 100 ;
        num[1] = 200 ;

        str[1] = "Better" ;

        System.out.println("String Array length is " + str.length);
        System.out.println("Integer Array length is " + num.length);
        System.out.println(num[0] + "," +num[1]+ "," +num[2]);
        System.out.println(str[0] + str[1] + str[2]);
    }
}
