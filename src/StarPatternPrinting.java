class StarPatternPrinting{
    public static void main(String[] args) {

        //Star pattern printing 1
//        int i,j,k;
//        for (i = 1; i <= 5; i++) {
//            for (j = 5; j >i; j--) {
//                System.out.print(" ");
//            }
//
//            for (k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

        //Star pattern printing 2
        int i,j,k;
        for (i = 1; i <= 5; i++) {
            for (j = i; j <= 5; j++) {
                System.out.print(" ");
            }

            for (k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
