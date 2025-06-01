import java.util.Scanner;

class Array{
    public static void main(String[] args) {
//        int a = 10, b = 20, c = 30, d = 40, e = 50;
//
//        //Here you know in compile time itself, how many values are there in the array. You can keep any size of array.
//        int a[] = {10, 20, 30, 40, 50};
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);


        //Here we have just 5 students so we made 5 variables.
        //If we need to store for 1000 students we cant create so many variables.
        //To store these multiple variables we have array where we can directly assign variables

        //Fixed size static array
//        int a[] = new int[5];
//        a[0] = 10;
//        a[1] = 20;
//        a[2] = 30;
//        a[3] = 40;
//        a[4] = 50;
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();

        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        size = sc.nextInt();
        int a[] = new int[size];
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Printed array elements ");
        for (i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
