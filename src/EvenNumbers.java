import java.util.Scanner;

class EvenNumbers{
    public static void main(String[] args) {
        //Print odd numbers in given range
        int n;
        System.out.println("Enter any number ");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=2; i<=n; i+=2){ //i=2 4 6 8 10 ...
            System.out.print(i);
        }
        System.out.println();

    }
}