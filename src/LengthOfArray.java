import java.util.Scanner;

class LengthOfArray{
    public static void main(String[] args) {

        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println(a.length);
    }
}
