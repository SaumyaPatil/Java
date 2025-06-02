import java.util.Arrays;
import java.util.Scanner;

class ArrayMethods{
    public static void main(String[] args) {

        //Sort() Equals() copyOf()
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data in array 1 ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter data in array 2 ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);  //It is a static method of arrays class
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        boolean b = Arrays.equals(a,b);     //true or false will be return
        System.out.println("Kya doono array equal hai " + b);

        //It copies data of 'a' into 'a2' and size of 'a2' is 5 is also given as an arguement.
        int a2[] = Arrays.copyOf(a, 5);
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
        System.out.println();

        int a2[] = Arrays.copyOf(a, 6);
        a2[5] = 100;
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
        System.out.println();
    }
}
