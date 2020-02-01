public class Java46 {
    private String maker;
    private String color;
    private String bodyType;

    public Java46(){
        maker = "Porsche";
        color = "Silver";
        bodyType = "Coupe";
    }

    private String accelerate(){
        String motion = "Accelerating...";
        return motion;
    }

    public void setJava46(String brand, String paint, String style){
        maker = brand;
        color = paint;
        bodyType = style;
    }

    public void getJava46(){
        System.out.println(maker + " paint is " + color);
        System.out.println(maker + " style is " + bodyType);
        System.out.println(maker + " is " + accelerate() + "\n");
    }
}
