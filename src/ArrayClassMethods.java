import java.util.Arrays;

class ArrayClassMethods{
    public static void main(String[] args) {
        // toString()   asList()   deepToString()

        //These are array class static methods, you need not create any object to access them
        //These accept the parameters of array variable

        //When you create array in this format and pass the values like this,
        //you need not use new keyword to create object of array and object is created by default
        //and you need not set manually values at every position

        //String a[] = {"Learn", "Coding", "Keypoints", "Education"};
        int a[] = {1,2,3,4,5};
        //Arrays is a class in java in util package which uses toString method that accepts array variable as arguement.
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.asList(a));  //prints the ref value of array
        System.out.println(a);
    }
}
