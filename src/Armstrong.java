import java.util.Scanner;

class Armstrong{
    public static void main(String[] args) {

        int n,c;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum=0;
        c=n;
        while(n>0){
            int k = n%10;
            sum += k*k*k;
            n = n/10;
        }
        if (c == sum)System.out.println("It is armstrong");
        else System.out.println("It is not an armstrong number");

    }
}
