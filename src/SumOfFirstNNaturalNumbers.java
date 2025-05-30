import java.util.Scanner;

class SumOfFirstNNaturalNumbers{
    public static void main(String[] args) {
        int n, sum=0;
        System.out.println("Enter no of terms ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for (int i=1; i<=n; i++){
            sum=sum+i;
        }

        System.out.println("ADDITION " + sum);


    }
}