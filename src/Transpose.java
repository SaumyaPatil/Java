import java.util.Scanner;

class Transpose{
    public static void main(String[] args) {
        int a[][] = new int[4][4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < i; j++) {
//                int temp = a[i][j];
//                a[i][j] = a[j][i];
//                a[j][i] = temp;
//            }
//        }
//
//        System.out.println("Transpose of the above matrix is ");
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

        //You can directly print the transpose of the matrix as follows
        System.out.println("Transpose of the above matrix is ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
