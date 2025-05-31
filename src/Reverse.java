import java.util.Scanner;

class Reverse{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int rev=0;
        while(n>0){
            int k = n%10;
            rev = k + rev*10;
            n = n/10;
        }
        System.out.println(rev);
    }
}
