class NumberPattern{
    public static void main(String[] args) {

        //Prints pattern 1
//        int i,j;
//        for (i = 1; i <= 5; i++) { //row
//            for (j = 1; j <= i; j++) {   //col
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        //Prints pattern 2
//        int i,j;
//        for (i = 1; i <= 5; i++) { //row
//            for (j = 1; j <= i; j++) {   //col
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        //Prints pattern 3
        int i,j,count=0;
        for (i = 1; i <= 5; i++) { //row
            for (j = 1; j <= i; j++) {   //col
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
