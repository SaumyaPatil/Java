import java.util.Scanner;

class SumOfNumbersOddOrEven{
    public static void main(String[] args) {

        int n;
        System.out.println("Enter the number ");
        int sum=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if(n%2 == 0){
                if (i%2 == 0)sum += i;
            } else {
                if (i%2 != 0)sum += i;
            }
        }
        System.out.println(sum);
    }
}
