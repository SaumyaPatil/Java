import java.util.Scanner;

class CopyArrayElements{
    public static void main(String[] args) {

        int a[] = new int[5];
        int b[];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
