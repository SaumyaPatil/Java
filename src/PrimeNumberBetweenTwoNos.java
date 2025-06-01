import java.util.Scanner;

class PrimeNumberBetweenTwoNos{
    public static void main(String[] args) {
        int n1, n2, k;
        System.out.println("Enter two numbers ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        k=n1+1;
        for (int i=k; i<n2; i++) {
            int j;
            for (j=2; j<i; j++){
                if (i%j == 0){
                    break;
                }
            }
            if (i==j) System.out.println(j);
        }
    }
}
