class StarPattern{
    public static void main(String[] args) {

        //Star pattern 1
//        int i,j;
//        for (i = 1; i <=5 ; i++) {      //rows
//            for (j = 1; j <= i; j++) {     //cols
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Star pattern 2
//        int i,j;
//        for (i = 1; i <=5 ; i++) {      //rows
//            for (j = 1; j >= i; j--) {     //cols
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //The above pattern can also be printed as
//        int i,j;
//        for (i = 5; i >=1 ; i--) {      //rows
//            for (j = 1; j <= i; j++) {     //cols
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Star pattern 3
//        int i,j,k;
//        for (i = 1; i <= 5; i++) {
//            for (j = i; j < 5; j++) {
//                System.out.print(" ");
//            }
//
//            for (k = 1; k <= i ; k++) {    //col
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

        //Star pattern 4
        int i, j, k;
        for (i = 1; i <= 5 ; i++) {     //rows
            for (j = 1; j <= i ; j++) {     //space
                System.out.print(" ");
            }
            for (k = i; k <= 5 ; k++) {   //cols
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
