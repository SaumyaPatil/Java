class Diamond{
    public static void main(String[] args) {

        //Diamond pattern way 1
//        int i,j,k;
//        for (i = 1; i <= 5; i++) {
//            for (j = 5; j > i; j--) {
//                System.out.print(" ");
//            }
//
//            for (k = 1; k <= 2*i-1; k++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        for (i = 4; i >= 1; i--) {
//            for (j = 5; j > i; j--) {
//                System.out.print(" ");
//            }
//
//            for (k = 1; k <= 2*i-1; k++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }



        //Diamond pattern way 2 -----> smarter way, mirror image ke liye sirf row ko
        //ulta chala diya 4 to 1
        int i,j,k;
        for (i = 1; i <= 5; i++) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (i = 4; i >= 1; i--) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
