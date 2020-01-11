public class Java15 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            {
                for (int j = 1; j < 4; j++)
                {
                    System.out.println("Running i = " + i + " j = " + j);
                    //for break put i==2 (it doesn't matter that much but depends)//
                if( i == 1 && j == 1 )
                {
                    System.out.println("Continues inner loop when i = " +i+ " j = " +j);
                    //or break//
                    continue;

                }
                }
            }
        }
    }
}