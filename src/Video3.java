public class Video3 {
    public static void main(String[] args) {
        int x = 1;
        int y = x;  //y equals 1
        x = 2;
        System.out.println(y);  //y still = 1 (very cool)
    }
}
