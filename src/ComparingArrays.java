import java.util.Arrays;

class ComparingArrays{
    public static void main(String[] args) {

        //1. ==
        //2. equals()

        int a[] = {10,20,30,40,50};
        int b[] = {10,20,30,40,50};

        //Isko array data se koi matlab nahi hai
        if (a==b){   //this == operator just looks at the reference variables and compares the reference variables
            System.out.println("Both are equals ");
        }else {
            System.out.println("Both are not equal");
        }

        //Iss method ko array ke data se matlab hai sirf reference se koi matlab nahi hai.
        if (Arrays.equals(a,b)){
            System.out.println("Both are equals ");
        }else {
            System.out.println("Both are not equal");
        }
    }
}
