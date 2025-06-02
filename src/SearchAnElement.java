import java.util.Scanner;

class SearchAnElement{
    public static void main(String[] args) {

        int a[] = new int[5];
        int item;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter search item ");
        item = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == item){
                System.out.println("Yes the item is in the array.");
                flag = true;
                break;
            }
        }
        if (flag == false) System.out.println("The item is not in the array.");
    }
}
