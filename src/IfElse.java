import java.util.Scanner;

class IfElse{
    public static void main(String[] args) {

        int n;
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if( n >= 0) System.out.println("Positive number ");
        else System.out.println("Negative number ");

    }
}

