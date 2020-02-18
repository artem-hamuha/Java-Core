import java.awt.*;

public class Video3 {
    public static void main(String[] args) {    //this doesn't show the change
        int x = 1;  // primitive type var
        int y = x;  //y equals 1
        x = 2;
        System.out.println(y);  //y still = 1 (very cool)
    }
    public void dvd(){  //this shows the change
        Point point1 = new Point(1,1) ; //reference type
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
