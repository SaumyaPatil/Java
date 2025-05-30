import java.util.Scanner;

class OddNumbers{
    public static void main(String[] args) {
        //Print odd numbers in given range
        int n;
        System.out.println("Enter any number ");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=1; i<=n; i+=2){
            System.out.print(i);
        }
        System.out.println();
    }
}
