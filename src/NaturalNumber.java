import java.util.Scanner;

class NaturalNumber{
    public static void main(String[] args) {

        int n;     //limit
        System.out.println("Enter no of term ");

        //sc refers to the object of Scanner class and Scanner class is inside a package so you need to import the package
        //in order to make compiler understand scanner class.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print(i + " ");
        }

        System.out.println();

    }
}