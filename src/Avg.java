import java.util.Scanner;

class Avg{
    public static void main(String[] args) {
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        double ans = sum/5.0;        //5.0 likhna pdega tabi ye fractional part bhi consider krega result ka output screen mein
        System.out.println(ans);
    }
}
