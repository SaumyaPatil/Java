class StarPatternPartTwo{
    public static void main(String[] args) {

        //Square of 5*5
//        int i,j;
//
//        for (int i = 1; i <= 5; i++) {  //row
//            for (int j = 1; j <= 5 ; j++) {  //col
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

        //Hollow square
        int i,j;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i==1 || i==5 || j==1 || j==5){
                    System.out.print("*");
                }else {
                    //Iss conditin ke bina fir uss particular co-ordinate par space print nai hoga jahaa upr ki condition work nai kr rahi
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
