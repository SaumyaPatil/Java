import java.util.Scanner;

class InsertItemInArray{
    public static void main(String[] args) {

        //a[3] = 34 67 23
        //loc=1 item=100
        //a[3+1]=34    100 67 23

        int size, loc, item, i;
        Scanner sc = new Scanner(System.in);
        
        size = sc.nextInt();
        
        int a[] = new int[size+1];
        System.out.println("Enter array elements ");
        for (int j = 0; j < size; j++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter array location ");
        loc = sc.nextInt();

        System.out.println("Enter new item ");
        item = sc.nextInt();

        for (int i = size; i > loc; i--) {
            a[i] = a[i-1];
        }

        a[loc] = item;
        size++;
        for (int j = 0; j < size; j++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}