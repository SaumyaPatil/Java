import java.util.Scanner;

class DescendingOrder{
    public static void main(String[] args) {
        //Sort array elements in descending order

        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements in array ");
        for (int i = 0; i < 5; i++) {
            a[i]=sc.nextInt();
        }

        int temp;
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                if (a[j]>a[i]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}