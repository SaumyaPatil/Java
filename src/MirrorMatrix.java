import java.util.Scanner;

class MirrorMatrix{
    public static void main(String[] args) {

        int a[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing array matrix ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

//        System.out.println("This is the mirror matrix from right to left ");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 2; j >= 0; j--) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

        System.out.println("This is the mirror matrix from top to bottom ");
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
