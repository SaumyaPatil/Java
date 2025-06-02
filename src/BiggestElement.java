import java.util.Scanner;

class BiggestElement{
    public static void main(String[] args) {

        //Biggest element in array
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5; i++){
            a[i] = sc.nextInt();
        }

        int ans=a[0];
        for (int i = 1; i < 5; i++) {
            if (a[i]>ans) ans = a[i];
        }
        System.out.println(ans);
    }
}