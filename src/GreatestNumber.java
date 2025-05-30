import java.util.Scanner;

class GreatestNumber{
    public static void main(String[] args) {
        //Maximum number b/w two numbers

        int a,b;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        if (a>b) System.out.println("a is greater");
        else System.out.println("b is greater");
    }
}
