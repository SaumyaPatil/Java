import java.util.Scanner;

class FactorialOfANumber{
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int fac = 1;
        for (int i=1; i<=n; i++){
            fac = fac*i;
        }

        System.out.println("Factorial of the given number is " + fac);
    }
}
