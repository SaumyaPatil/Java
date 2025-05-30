class NestedForLoop{
    public static void main(String[] args) {
        int i,j;
        for (int i = 0; i < 5; i++) {      //row
            for (int j = 0; j < 5; j++) {      //col
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
