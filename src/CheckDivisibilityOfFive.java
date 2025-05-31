import java.util.Scanner;

class CheckDivisibilityOfFive{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n%5==0) System.out.println("Divisible by 5");
        else System.out.println("Not divisible by 5");
    }
}
