class CharPattern{
    public static void main(String[] args) {

        //Char pattern 1
//        char i, j;
        //Here you can use the ascii codes of the chars like A=65 and E=69
//        for (i = 'A'; i <= 'E'; i++) {    //row    A=65  &  E=69 in all three patterns
//            for (j = 'A'; j <= i; j++) {    //col
//                System.out.print(j);
//            }
//
//            System.out.println();
//        }


        //Char pattern 2
//        char i, j;
//        for (i = 'A'; i <= 'E'; i++) {
//            for (j = 'A'; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }


        //Char pattern 3
        char i, j, ch='A';
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
