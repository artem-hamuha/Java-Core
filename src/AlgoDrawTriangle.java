public class AlgoDrawTriangle {

    //      task:
    //      ================================
    //      1*****
    //      12****
    //      123***
    //      1234**
    //      12345*




    public static void main(String[] args) {
        for (int i=1;i<=6; i++) {
            for (int j=1;j<=i; j++) {
                System.out.print(j);
            }
            for (int k=6; k>i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
