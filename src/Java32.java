public class Java32 {
    public static void main(String[] args) {
        int[] nums = new int[60];   //created an array of 60 elements
        for(int i = 1 ; i < 60 ; i++){nums[i] = i ;} // filled elements 1-59 w/integers 1-59

        for(int i = 1 ; i < 60 ; i++){  //shuffles the values in 1-59
            int r = (int) Math.ceil(Math.random() * 59);
            int temp = nums[1];
            nums[i] = nums[r] ;
            nums[r] = temp ;
        }
        for (int i = 1 ; i < 7 ; i++){  //only outputs the values in 1-6
            System.out.println("Your numbers are : ");
            System.out.println(Integer.toString(nums[i]) + "\t ");
        }
    }
}
