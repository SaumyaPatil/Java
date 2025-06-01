import java.util.Scanner;

class Perfect{
    public static void main(String[] args) {
        int n, sum=0;
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (n%i == 0){
                sum += i;
            }
        }

        if (sum == n) System.out.println("It is a perfect number.");
        else System.out.println("It is not a perfect number.");
    }
}
