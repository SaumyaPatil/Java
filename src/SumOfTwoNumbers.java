import java.util.Scanner;

class SumOfTwoNumbers{
    public static void main(String[] args) {
        int a,b,sum;
        System.out.println("Enter the numbers ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        sum = a+b;
        System.out.println("ADDITION " + sum);
    }
}

