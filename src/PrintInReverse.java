import java.util.Scanner;

class PrintInReverse{
    public static void main(String[] args) {

        int size;
        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
