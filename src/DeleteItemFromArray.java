import java.util.Scanner;

class DeleteItemFromArray{
    public static void main(String[] args) {
        //a[3] = 45 67 23
        //loc=1
        //a[3-1] = 45 23

        int size, loc, i;
        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();

        int a[] = new int[size];
        System.out.println("Enter array elements ");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter array location ");
        loc = sc.nextInt();

        for (i = loc; i < a.length-1; i++) {
            a[i] = a[i+1];
        }
        size--;

        for (i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
