import java.util.Scanner;

class Factor{
    public static void main(String[] args) {
        //Find factor of a number
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i=1; i<=num; i++){
            if (num%i==0) System.out.print(i + " ");
        }
        System.out.println();
    }
}
