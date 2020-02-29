import java.util.Arrays;    //Arrays imports a package which allows you to mess with the array data a bit

public class Video6 {
    public static void main(String[] args) {
        int[] numbers = new int[5]; //arrays are reference types so use "new"
        numbers[0] = 6; //remember that 0 = 1 as if in the list/array
        numbers[1] = 3;
        //with these you can assign things in the array
        System.out.println(numbers);    // you get a weird string which is a address of the object in memory
        System.out.println(Arrays.toString(numbers));   //this gives you the actual data of the array
    }
    public void NewMeathod(){   //there is a better way of working/creating with an array
        int[] numbers = {1,1,8,5,3};
        System.out.println(numbers.length); // you get 5 because thats how much items you got in your array
        //you could also see that my array is like random numbers in a random order
        //if you want to sort them in order do this
        Arrays.sort(numbers);
        System.out.println(numbers);    //after you run your array you get the numbers in order
    }
}
