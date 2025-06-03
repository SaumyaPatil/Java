class HalfDiamond{
    public static void main(String[] args) {

        //First way
//        int i,j,k;
//        for (i = 1; i <= 5; i++) {   //60% kaam
//            for (j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (i = 4; i >= 1; i--) {   //40% kaam
//            for (j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Second way
//        int i,j,k;
//        for (i = 1; i <= 5; i++) {  //60% kaam
//            for (j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (i = 1; i <= 4; i++) {  //40% kaam
//            for (j = 4; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Third way
        int i,j,k;
        for (i = 1; i <= 4; i++) {     //40%
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = 5; i >= 1; i--) {    //60%
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
