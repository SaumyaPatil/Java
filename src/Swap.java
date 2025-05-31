
//Ram ------> 10      Syam ------> 20
//Ram ------> 20  <---> RAJU <----> Syam -------> 10

import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        int p1, p2;
        Scanner sc = new Scanner(System.in);

        p1 = sc.nextInt();
        p2 = sc.nextInt();

        System.out.println("Before swapping " + p1 + " " + p2);

        int temp;
        temp = p1;
        p1 = p2;
        p2 = temp;

        System.out.println("After swapping " + p1 + " " + p2);
    }
}
